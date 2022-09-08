//This code was one of my exam. What this code does is it has a user enter a number in string form (Example Nine)
//Then it outputs on the screen the integer value (Example Nine -> 9) 
//Will continue to do this till the user enters an emptyline
//Does have strict requirements on the user input read commnets within code to understand restrictions
//Has to have the IE9Helper file with it as well to work correctly


import java.util.Scanner; 

public class StringToInteger{
   /*
         The main method will keep reading a line of text from the user until they enter
         an empty line. For each line, you will use the translate method that you will write below
         in order to convert the text to an integer value. 
         
         The text that the user will provide to your program will represent the spelling of a number between 0
         and 9999, in words. You will display the corresponding integer value.
         
         Examples; 
         What the user types:                      The value your program must display:
         ten                                       10
         nineteen                                  19
         twenty three                              23
         ninety nine                               99
         one hundred and ninety nine               199
         two hundred and ninety nine               299
         two hundreds and ninety nine              299
         twelve hundreds and ninety nine           1299
         ninety hundreds seventy five              9075
         twelve thousands two hundreds and nine    12209
         three thousand nine hundred and three     3903
         
         For this exam, you can safely assume that the user will always follow the syntax
         illustrated by these examples and the tests inside IE9Helper.testTranslate()
   */
   public static void main(String[] args){
      
          
      // Uncomment the following if you want to run some tests on your methods
      // Try to uncomment one at a time to reduce the amount of information displayed in the console in one shot
      
     // IE9Helper.testTranslate();
     // IE9Helper.testTranslateWordToValue();
     // IE9Helper.testCleanUp();
     // IE9Helper.testTranslateAllValues();
      
       
      Scanner input = new Scanner(System.in); //new scanner variable
      String userInput = "lets get this code Started"; //variable to read line from user 
      do{ 
         userInput = input.nextLine(); 
         System.out.println(translate(userInput)); 
      
      
      } while(userInput != "");//end of Do-While loop
   
      
      
   }// end main
   
   
   /*
      The translate method takes a String representing a line of text
      provided by the user and applies the following processing to it;
      1. It uses the IE9Helper.tokenize method to break down the one
         String into an array of Strings named tokens that contains the words
         from the initial String as elements. 
      2. It uses the cleanUp method, that we will write later, to take
         tokens as parameter and return a new array of Strings that we will
         refer to as cleanTokens.
         See the details in the instruction for the cleanUp method below.
      3. It creates an array of integer values, named values, that has the same
         size as cleanTokens.
      4. It iterates over all elements in cleanTokens and stores in value[i]
         the result of calling the method translateWordToValue on cleanTokens[i]
      5. It then return the result of calling the method TranslateAllValue on the
         array values

         Uncomment the call to IE9Helper.testTranslate() in the main to run a
         series of basic tests on this method.
   */
   public static int translate(String input){
      String [] tokens = IE9Helper.tokenize(input); 
      String [] cleanTokens = cleanUp(tokens); 
      int [] values = new int [cleanTokens.length]; 
      for (int i = 0; i < values.length; i++) { 
         values[i] = translateWordToValue(cleanTokens[i]); 
      }//end of For loop 
      
      return translateAllValues(values);
   }//end of translate method
   
   
   
   /*
      Method cleanUp takes an array of Strings as parameter. It returns a new array of Strings
      of the same length in which, every element of the original array has been trimmed and
      converted to lower cases. In addition, we will also make sure that if any of the String
      ends with a letter 's' (or 'S' since we convert to lower case beforehand anyway), then
      we remove that letter. This will allow us to transform things like "   ThOUSAnDS   "
      into an easier String to work with; "thousand".
      
      Uncomment the call to the method IE9Helper.testCleanUp();
      in the main if you want to see the result or testing this method on a basic series
      of tests. 
   */
   public static String[] cleanUp(String[] toks){ 
      for (int i = 0; i < toks.length; i++) { 
         toks[i] = toks[i].toLowerCase(); 
         toks[i] = toks[i].trim();
         if (toks[i].length() == 0) { 
            System.exit(1); 
         } //end of If Statement  
         if (toks[i].charAt(toks[i].length() - 1) == 's') { 
            toks[i] = toks[i].substring(0, toks[i].length() - 1); 
         } //end of If Statement 
      } //end of For Loop  
      return toks;
   }//end cleanUp method
   
   
   
   /*
      Method translateWordToValue takes a String representing one of the following words and returns its value. 
      "zero" to "nineteen" --> values 0 to 19
      "twenty", "thirty" ... "hundred" --> values 20, 30, ... 100
      "thousand" --> value 1000
      If the String passed as parameter does not match any of these, return 0
      
      You will be graded on your ability to use loops, when possible, to process some of the tests.
      
      Uncomment the call to the method IE9Helper.testTranslateWordToValue();
      in the main if you want to see the result or testing this method on a basic series
      of tests.
   */
   public static int translateWordToValue(String word){
      int result = 0; // used to calculate the value of the word 
      switch (word) { 
         case "zero": result = 0; 
            break;
         case "one": result = 1; 
            break; 
         case "two": result = 2; 
            break;
         case "three": result = 3; 
            break;
         case "four": result = 4; 
            break;
         case "five": result = 5; 
            break;
         case "six": result = 6; 
            break;
         case "seven": result = 7; 
            break;
         case "eight": result = 8; 
            break;
         case "nine": result = 9; 
            break;
         case "ten": result = 10 ; 
            break;
         case "eleven": result = 11; 
            break;
         case "twelve": result = 12; 
            break;
         case "thirteen": result = 13; 
            break;
         case "fourteen": result = 14; 
            break;
         case "fifteen": result = 15; 
            break;
         case "sixteen": result = 16; 
            break;
         case "seventeen": result = 17; 
            break;
         case "eighteen": result = 18; 
            break;
         case "nineteen": result = 19; 
            break;
         case "twenty": result = 20; 
            break;
         case "thirty": result = 30; 
            break;
         case "forty": result = 40; 
            break;
         case "fifty": result = 50; 
            break;
         case "sixty": result = 60; 
            break;
         case "seventy": result = 70; 
            break;
         case "eighty": result = 80; 
            break;
         case "ninety": result = 90; 
            break;
         case "hundred": result = 100; 
            break;
         case "thousand": result = 1000; 
            break;   
      }//end of Switch Statement 
           
      return result; 
   }//end translateWordToValue method
   
   
   /*
      Method translateAllValues takes an array of int values like the ones returned
      by the method translateWordToValue. It convert such a sequence of values into 
      the final value represented by the original string entered by the user.
      
      To do so, you can start by adding all the values together. 
      When the user enters things like "twenty three" the parameter will be an array
      {20, 3} so this method is enough to handle the trivial cases.
      
      However, when the user enters things like "two hundred twenty three" 
      or "two thousand twenty three" then, when you encounter the values 100 or 1000,
      you need to do something a bit more clever in order to compute the right value. 
      This last part of the exam is the hardest so focus on getting as much as you can
      working before to dig into this.
      
      Uncomment the call to the method IE9Helper.testTranslateAllValues();
      in the main if you want to see the result or testing this method on a basic series
      of tests.
   */
   public static int translateAllValues(int[] values){
      int result = 0; //used to calculate the value of the all ints in the array value 
      if(values.length == 1) { 
         return values[0]; 
      } else { 
         for (int i = 0; i < values.length - 1; i++) {
         
            if(values[i+1] == 100 || values[i+1] == 1000) { 
               result += (values[i] * values[i+1]);
               i++;
            } else { 
               result += values[i]; 
            }//end of If-Else Statement
         }//end of For Statment  
      }//end of If-Else Statement
      result += values[values.length - 1]; 
      return result; 
   }//end translateAllValues method

}// end class
