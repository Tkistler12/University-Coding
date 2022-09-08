//This code is me just practicing tracing code execution with a while loop

public class Pq02 {

   public static void main(String[] args) { 
      pqCodeTracingExample(); 
    }// end of main method 
    
    
   public static void pqCodeTracingExample(){ 
   int counter = 20;
      int result = 0; 
      while(counter > 1) { 
         result = result + (counter * 2); 
         counter = counter - 2; 
         System.out.println(result);
      } 
      System.out.println(result); 
   } 
      
   
} // end of Class 
 

