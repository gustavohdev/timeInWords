package hello;

public class ParsingHour {
    
        // tratar essa exceção, para mostrar a causa

       /*public static void main(String[] args) {
           try {
               String value = new String();
               new ParsingHour().intParsingMethod(value);
           } catch (NumberFormatException e) {
              System.out.println("We can catch the NumberFormatException");
              
           }
        }*/

        static int intParsingMethod(String value) throws NumberFormatException{
            int x = Integer.parseInt(value);
            return x;
    
         }
     
    }