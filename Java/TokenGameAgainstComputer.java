//This was one of my exams it is game with the computer 
//Start at 21 coins and each turn either the user or the computer takes 1 to 3 coins away
//Computer generates a random number between 1 and 3 that;s how it decides how many to take away 
//User inputs how many they want to take away 
//Whoever takes the last coin Wins!!!

import java.util.Scanner; 

public class TokenGameAgainstComputer { 
   public static void main(String[] args) { 
      Scanner input = new Scanner(System.in);
      int whoWon = 0;      // Used to show who won the game 
      int coins = 21;      // Used to show the number of coins remaining 
      int take = 0;        //  Used to show what number of coins is being taken out that round
      int whoIsNext = 1;   // Used to show who's turn is next
      int youDecide = 0;   // Used to read variable from user
     
      while (whoWon == 0) { 
         System.out.println(coins); 
         if (whoIsNext == 1) { 
            whoIsNext = 2;
            take = (int)(Math.random() * 3) + 1;
            System.out.println("Computer takes " + take + " coins");
            coins -= take; 
            if (coins <= 0) {
               whoWon = 1; 
            } // Closes if (coins <= 0) statement
         } else { 
            if (whoIsNext == 2) { 
               whoIsNext = 1;
               youDecide = input.nextInt(); 
               while(youDecide < 1) { 
                  System.out.println("You must take atleast 1 coin each round");
                  System.out.println("Please Insert a new value"); 
                  youDecide = input.nextInt();
                  while(youDecide > 3) {
                     System.out.println("You can only take a maximum of three coins each round");
                     System.out.println("Please Insert a new value"); 
                     youDecide = input.nextInt();              
                  } // Closes while(youDecide > 3) loop             
               } // Closes while(youDecide < 1) loop
               while(youDecide > 3) {
                  System.out.println("You can only take a maximum of three coins each round");
                  System.out.println("Please Insert a new value"); 
                  youDecide = input.nextInt(); 
                  while(youDecide < 1) { 
                     System.out.println("You must take atleast 1 coin each round"); 
                     System.out.println("Please Insert a new value");
                     youDecide = input.nextInt();
                  } // Closes while(youDecide < 1) loop 
               } // Closes while(youDecide > 3) loop  
               coins -= youDecide;
               if(coins <= 0) { 
               whoWon = 2; 
               } // Closes if(coins <= 0) Statement 
            } // Closes if(whoIsNext == 2) statement 
         } // Closes else statement for if(whoIsNext == 1) Statement 
      } // Closes while(whoIsNext) Loop  
      if (whoWon == 1) { 
         System.out.println("The computer won, bow to your AI Overlord"); 
      } // Closes if (whoWon == 1) Statement 
      else { 
         if (whoWon == 2) { 
            System.out.println("The human player won this time...");
         } // Closes if(whoWon == 2) Statement
          else { 
            System.out.println("Nobody won,something went wrong"); 
         } // Closes else Statement for If(whoWon == 2) Statement 
      } // Closes else Statement for If(whoWon == 1) Statement 
   } // Closes Main Method
} // Closes IE04 Class