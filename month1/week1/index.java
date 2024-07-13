import java.io.*;

 import java.util.Date;
public class index { 
    // public static void main(String args[]) 
    // { 
    //     System.out.println("Hello World"); 
    // } 

    /******************************************************************************************************************************************** */

    // Output ( System.out )

        // public static void main(String args[]){

        //     String firstName = "Egypta";
        //     String lastName = "Gogoi";
        //     int age = 23;
            
        //     // print()
        //     //  simple print function
        //     // The cursor remains at the end of the text on the console.
        //     System.out.print("\nprint(): The cursor remains at the end of the text on the console.\n\n");

        //     // println()
        //     // the cursor is at the starting of the next line.
        //     System.out.println("println(): I print a line and the cursor is at the starting of the next line.\n");

        //     // printf
        //     // similar to printf in C
        //     // String concatination and formate specifiers
        //     System.out.printf("printf(): similar to printf in C.\n");
        //     System.out.printf("String concatination and formate specifier:\n" + firstName + " " + lastName + " ,her age is %d\n",age);
        // }

    // Error ( System.in )
    
    // public static void main(String args[]) 
    // throws IOException 
    // { 
        
    // } 


    /*
        public static void main(String args[]){
            byte a = 127;
            System.out.println((int)a);
        }
     */
    public static void main(String args[]){
        // byte i=-129;
        // System.out.println(i-1);
        double number = 123.456789;
        System.out.printf("%10.2f%n", number);
        
        System.out.printf("%-10.2f%n", number);
        String name1 = "Alice";
        String name2 = "Bob";
        int score1 = 95;
        int score2 = 87;

        System.out.printf("%-10s %10s%n", "Name", "Score");
        System.out.printf("%-10s %10d%n", name1, score1);
        System.out.printf("%-10s %10d%n", name2, score2);

       

        Date date = new Date();
        System.out.printf("Current date: %tF %n", date); // ISO 8601 format
        System.out.printf("Time: %tT %n", date);         // 24-hour time



    }
}