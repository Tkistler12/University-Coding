//Just Practicing the Syntax for the Java Scanner to read input from the User

import java.util.Scanner; 

public class ScannerPractice { 

   public static void main(String[] args) { 
      scanUserInt(); 
   
   } // closes main method 



   public static void scanUserInt() {
      int n = 0;    
      Scanner s = new Scanner(System.in); 
      System.out.print("Please enter an Integer Value: "); 
      n = s.nextInt();
      System.out.println(); 
      System.out.print("The value you entered was: "); 
      System.out.print(n); 
   
   } // closes scanUserInt
} // closes public class