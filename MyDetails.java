/*
This is a program that outputs my name, age, and hobby
*/
import java.util.Scanner;
public class MyDetails
{
   // This is the entry of a Java program
   public static void main(String args[])
   {
      //Variables
      //Use final to make an unchangable variable
      //final String name = "Ian A. Herrera A.", hobby = "Reading";
      String name = "Ian A. Herrera A.", hobby = "Reading";
      int bornyear=1993, age = 23, currentyear = 2020;
      boolean older_21 = true;
      double sum=0, prereq_marks, averagescore=67.345;    
      Scanner input = new Scanner(System.in);
      
      
      //Changing age
      //age = 24;
      
      //User input
      System.out.println("What is your name?");
      name = input.nextLine();
      
      System.out.println("What is your hobby?(ONE WORD)");
      hobby = input.next();
      
      System.out.println("Which year were you born?");
      bornyear = input.nextInt();
      
      //System.out.println("What is your Average Score?");
      //averagescore = input.nextDouble();
      
      for(int i=1; i<=3; i++)
      {
         do
         {
            System.out.println("Enter marks for course " + i);
            System.out.println("(Between 50 and 100)");
            prereq_marks = input.nextDouble();
            sum = sum + prereq_marks;
         }while(prereq_marks < 50 || prereq_marks > 100);
      }
      
      //Prosecing detalis
      averagescore = sum/3;
      age = currentyear - bornyear;
      if(age<21){older_21 = false;}
      
      //Output
      System.out.println("My Details");
      System.out.println("----------");
      System.out.print("Name:  " + name);
      System.out.println();
      System.out.print("Hobby: " + hobby);
      System.out.println();
      System.out.println("Year of birth:  "+ bornyear);
      System.out.printf("Avergae score = %.1f",averagescore);
      System.out.println();
      if(older_21==true){System.out.println("You are enrolled!");}
      else{System.out.println("You are younger than 21 -Sorry");}
      
   }
}