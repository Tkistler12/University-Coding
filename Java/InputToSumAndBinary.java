//This was one of my exams
//Task one user needs to input integers and it will output the sum of those 
   //Example 1234 -> 10 
//Task two outputs the highest integer before an integer overflow occurs 
//Task Three User inputs an integer and it will out put the binary representaion of it 


/* 
Tristan Kistler 
Code for IE-05
*/ 

import java.util.Scanner; 

public class InputToSumAndBinary { 
   public static void main(String[] args) { 
   
      Scanner input = new Scanner(System.in); 
      long taskOne = 0;  // Used to read a value from the user in Task #1
      int sum = 0;       // Used to compute the sum of all the digits entered in Task #1 
      int taskTwo = 0;   // Used to get an integer overflow in Task #2 
      int taskThree = 0; // Used to read a value from the user in Task #3 
      int quotient = 0;  // used to convert to binary in Task #3 
      int remainder = 0; // used to convert to binary in Task #3
     
      System.out.println("Task #1 Is Started");    
      taskOne = input.nextLong(); 
      while (taskOne > 0) { 
         sum += (taskOne % 10);
         taskOne /= 10;  
      } // Closing while loop 
      System.out.println(sum); 
      System.out.println("Task #1 Is Complete");
      
      System.out.println("Task #2 Is Started");
      while(taskTwo != 2147483647) { 
         taskTwo++; 
      } // Closes While loop 
      System.out.println(taskTwo); 
      System.out.println("Task #2 Is Complete");
      
      System.out.println("Task #3 Is Started");
      taskThree = input.nextInt(); 
      while(taskThree > 0) { 
         quotient = (taskThree / 2);
         remainder = (taskThree % 2);  
         System.out.print(remainder); 
         taskThree = quotient; 
      } // Closes While loop       
      System.out.println("\n"); 
      System.out.println("Task #3 Is Complete"); 
   } // end of main method 
} // end of public class IE-05



