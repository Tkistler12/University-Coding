//This code was one of my exams
//It keeps a database of the amount of peanuts, walnuts and almonds squirrels have stored up
//User must enter either "walnuts", "peanuts", or "almonds" followed by an "=" and then an integer value 
//Example "Walnuts = 9" 
//Will then output the updated amount of walnuts, peanuts, and almonds
//User must enter "exit" or "bye" to stop the code


import java.util.Scanner; 

public class SquirrelNutDatabase {
   public static void main(String[] args) { 
      int peanuts = 0;       //Keeps track of the # of peanuts  
      int walnuts = 0;       //Keeps track of the # of walnuts 
      int almonds = 0;       //Keeps track of the # of almonds  
      int equalIndex = 0;    //Store the index of the "=" 
      String userInput = ""; //Store what the user inputs
      String part1 = "";     //Store everything before the "="
      String part2 = "";     //Store everything after the "="
      Scanner input = new Scanner(System.in);

      while(true) { 
         userInput = input.nextLine(); 
         userInput = userInput.trim(); 
         userInput = userInput.toLowerCase();
         
         if(userInput.equals("bye") || userInput.equals("exit")) 
            break;
             
         equalIndex = userInput.indexOf("=");
          
         if(equalIndex == -1) {
            System.out.println("Syntax Error...");
            continue; 
         }//End of If(equalIndex == -1) loop
         
         part1 = userInput.substring(0,equalIndex); 
         part1 = part1.trim(); 
         part2 = userInput.substring(equalIndex + 1); 
         part2 = part2.trim(); 
         
         if(part1.equals("almonds")) { 
            almonds = Integer.parseInt(part2); 
            System.out.println("Our Current Stocks are: " + peanuts + " Peanuts, " + walnuts + " Walnuts, " + almonds + " Almonds");
         }//Closes If(part1.equals("almonds") 
         else if (part1.equals("peanuts")) { 
            peanuts = Integer.parseInt(part2); 
            System.out.println("Our Current Stocks are: " + peanuts + " Peanuts, " + walnuts + " Walnuts, " + almonds + " Almonds");
         }//Closes If(part1.equals("peanuts")
         else if (part1.equals("walnuts")) { 
            walnuts = Integer.parseInt(part2); 
            System.out.println("Our Current Stocks are: " + peanuts + " Peanuts, " + walnuts + " Walnuts, " + almonds + " Almonds");
         }//Closes If(part1.equals("walnuts")
         else {
            System.out.println("Sorry we do not stock up on " + part1); 
            continue;
         } //Final closing bracket for the big Else-If Statement 
      }//End of While(true) loop  
   } //End of main method 
}//End of public class