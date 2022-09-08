package MyStringLib; 

public class MyStringLib { 

   public static String [] tokenize (String str) { 
      int index = 0; 
      String [] input = null; 
      String token = "";
      while (index < str.length()) {
         int spaceIndex = str.indexOf(" ", index); 
         if(spaceIndex == -1) { 
            token = str.substring(index); 
            input = addToken(input, token); 
            index += token.length() + 1;
         } else { 
            token = str.substring(index, spaceIndex);
            input = addToken(input, token);
            index += token.length() + 1; 
         } 
      }//end of while loop      
      return input; 
   } //end of tokenize method 

   public static String [] addToken (String [] tokens, String token) {
      String [] addedToken;
      int length; 
      if(tokens == null ) { 
         length = 1;  
      } else { 
         length = tokens.length + 1; 
      } //end of if-else 
      addedToken = new String [length];
      for (int i = 0; i < length - 1; i++) { 
         addedToken[i] = tokens[i];
      } //end of for loop 
      addedToken[addedToken.length - 1] = token; 
      return addedToken; 
   }// end of addToken method 
}// end of Class