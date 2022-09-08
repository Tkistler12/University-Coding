package MyStringLib;
 
public class TestMyStringLib { 
   public static void main ( String [] args) { 
   
   
   String str = "Hello World There"; 
   String [] test = MyStringLib.tokenize(str); 
   for ( String value: test) {
      System.out.println(value); 
   }  
   
   String str2 = "I am kind of nervous for this class! "; 
   String [] test2 = MyStringLib.tokenize(str2); 
   for ( String value: test2) {
      System.out.println(value); 
   }  

   
   
   
   } // end of main 




}// end of class 