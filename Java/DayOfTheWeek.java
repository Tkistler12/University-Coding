//Program tells you what day of the week it is \
//User inputs what the date is and also what the first day of the month was
//Outputs the day of the week


import java.util.Scanner; // Imports Scanner 

public class DayOfTheWeek { 
   public static void main(String[] args) { 
      int dayOfTheWeek = 0;       // Will output what day of week it is
      int dayOfTheMonth = 0;      //Will read the integer value from the user on what the date is
      int firstDayOfTheMonth = 0; //Will read the integer value from the user on what the first day of the month was
   
      Scanner s = new Scanner(System.in); //Scanner variable that will read input from user
   
      System.out.print("Please enter an integer representing the date in the current month:"); 
      dayOfTheMonth = s.nextInt(); 
      System.out.println(); 
      dayOfTheMonth = (dayOfTheMonth - 1); 
      
      System.out.print("What was the first day of the month? Enter 0 for Monday, 1 for Tuesday, 2 for Wednesday, 3 for Thursday, 4 for Friday, 5 For Saturday, 6 For Sunday: ");
      firstDayOfTheMonth = s.nextInt();
      System.out.println();
      dayOfTheMonth = (dayOfTheMonth + firstDayOfTheMonth); 
      dayOfTheWeek = (dayOfTheMonth % 7);
            
      System.out.print("Today is "); 
      if (dayOfTheWeek == 0) { 
         System.out.print("Monday"); 
      } //Closes if(dayOfTheWeek == 0) Statement  
      
      if (dayOfTheWeek == 1) { 
         System.out.print("Tuesday"); 
      } //Closes if(dayOfTheWeek == 1) Statement  
      
      if (dayOfTheWeek == 2) { 
         System.out.print("Wednesday"); 
      } //Closes if(dayOfTheWeek == 2) Statement 
      
      if (dayOfTheWeek == 3) { 
         System.out.print("Thursday");
      } //Closes if(dayOfTheWeek == 3) Statement  
      
      if (dayOfTheWeek == 4) { 
         System.out.print("Friday"); 
      } //Closes if(dayOfTheWeek == 4) Statement
      
      if (dayOfTheWeek == 5) { 
         System.out.print("Saturday"); 
      } //Closes if (dayOfTheWeek == 5) Statement 
      
      if (dayOfTheWeek == 6) { 
         System.out.print("Sunday");
      } //Closes if (dayOfTheWeek == 6) Statement     
  
   } // closes main method 

} // closes pulbic class