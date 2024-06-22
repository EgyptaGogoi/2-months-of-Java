// Nayanmoni ------------------

import java.util.Scanner;

public class loops {
    static void pattern_one(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_two(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void pattern_three(int n){
        for(int i = 1; i <= n; i++){
            for( int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    static void pattern_four(int n){
        for(int i = 1; i <= n; i++){
            for( int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
    }

    static void pattern_reverse(int n){
        for(int i = 1; i <= n; i++){
            for( int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    // public static void main(String arg[]){
    //     Scanner in = new Scanner(System.in);
    //     pattern_one(5);
    //     pattern_two(5);
    //     pattern_three(5);
    //     pattern_four(5);
    // }

    public static void main(String arg[]){
        System.out.println("Nayan".compareTo("nayan"));
        //  // Declare String using literal
        //  String str1 = "Geeks";
        
        //  // Declare another String using the same literal
        //  String str2 = "Geeks";
         
        //  System.out.println(str1.charAt(0));
        //  System.out.println(str2.equalsIgnoreCase(str1));
        //  // Check if both references point to the same object
        //  System.out.println("str1 == str2: " + (str1 == str2)); // Should print true
 
        //  // Declare String using new operator
        //  String str3 = new String("Geeks");
         
        //  // Check if str3 is the same as str1
        //  System.out.println("str1 == str3: " + (str1 == str3)); // Should print false
 
        //  // Intern str3 and compare again
        //  String str4 = str3.intern();
        //  System.out.println("str1 == str4: " + (str1 == str4)); // Should print true
        //  System.out.println(str4.compareTo(str1));
    }
}
