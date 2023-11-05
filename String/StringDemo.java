package String;

public class StringDemo {

    public static void main(String[] args) {

        String first="Hello";
        String second="World";

                String space="      World        space";


       

        // Concatination of two string
        System.out.println(first.concat(second));

        //Remove etra space of string.
        System.out.println(space.trim());

        //uPPER CASE TO lower case and vise versa
         String lower="this sentece is in the lower case by default";
        String upper="THIS CASE IS IN THE UPPER CASE BY DEFAULT";
        System.out.println(lower.toUpperCase());
        System.out.println(upper.toLowerCase());


        //to check the string is empty or null

        String nullString=null;
        // String nullString1;

        String emptyString="";

        System.out.println(nullString==null);
        // System.out.println(nullString.isEmpty());  throw error bcoz its already null and not assigned any value
        // System.out.println(nullString1==null);   throw error becoz its not initialize
        System.out.println(emptyString==null);
        System.out.println(emptyString.isBlank());
        System.out.println(emptyString.isEmpty());
        





        
    }
    
}
