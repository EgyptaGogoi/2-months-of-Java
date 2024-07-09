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

    static void pattern_five(int n){
        for(int i = n; i > 0; i--){
            for( int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // static void pattern_reverse(int n){
    //     for(int i = 1; i <= n; i++){
    //         for( int j = 1; j <= i; j++)
    //             System.out.print(j);
    //         System.out.println();
    //     }
    // }



    static void pattern_seven(int n){

        int spaces = n-1, stars = 1;
        
        for(int k = 0;k < n; k++){
            
            for(int i = 0; i < spaces; i++)
                System.out.print(" ");
            for(int j = 0; j < stars; j++)
                System.out.print("*");
            System.out.println();

            --spaces; 
            stars += 2;
        }
    }

        // for(int i = n-1, j=1; j < ((2*n)+1); j+=2, i--){
        //     for(int k = 1; k <= i; k++)
        //         System.out.print(" ");
        //     for(int k = 1; k <= j; k++)
        //         System.out.print("*");
        //     System.out.println();
        // }
    // }

    static void pattern_eight(int n){
        int spaces = 0, stars = ((2*n)-1);
        for(int k = 0;k < n; k++){
            for( int i = 0; i < spaces; i++)
                System.out.print(" ");
            for(int j = 0; j < stars; j++)
                System.out.print("*");
            System.out.println();
            ++spaces; 
            stars -= 2;
        }
    }

    static void pattern_nine(int n){
        pattern_seven(n);
        pattern_eight(n);
    }

    static void pattern_ten(int n){
        pattern_two(n-1);
        pattern_five(n);
    }

    static void pattern_eleven(int n){
        for( int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++)
                    System.out.print((i+j)%2);
            System.out.println();
        }
    }

    static void pattern_twelve(int n){
        int space = (n-1)*2, initialValue = 1;
        for(int i = 0; i < n; i++){
            // first n numbers in serial
            for(int j = initialValue; j <= i+1; j++){
                System.out.print(j);
                initialValue = j;
            }

            // spaces between
            for(int j = space; j > 0; j--)
                System.out.print(" ");

            // last n numbers in desending order
            for(int j = initialValue; j > 0; j--)
                System.out.print(j);
            space -= 2;
            initialValue = 1;
            System.out.println();
        }
    }

    static void pattern_twentyOne(int n){
        for(int i = 0; i < n ; i++)
            System.out.print("*");
        System.out.println();

        for(int i = 0; i < n-2 ; i++){
            for(int j = 0; j < n-1 ; j++){
                if(j==0 || j == n-2)
                    System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = 0; i < n ; i++)
            System.out.print("*");
    }

    static void pattern_twentyTwo(int n){
        int spaces = (2*n)-3, initialValue = n;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++)
                System.out.print(initialValue--);
            ++initialValue;

            for(int j = 0; j < spaces; j++)
                System.out.print(" ");
            spaces -= 2;

            for(int j = 0; j < i; j++)
                System.out.print(initialValue++);
            --initialValue;
            System.out.println();
        }


        spaces = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++)
                System.out.print(initialValue--);
            ++initialValue;

            for(int j = 0; j < spaces; j++)
                System.out.print(" ");
            spaces += 2;

            for(int j = 0; j < i; j++)
                System.out.print(initialValue++);
            --initialValue;
            System.out.println();
        }
    }

    public static void main(String arg[]){
        // Scanner in = new Scanner(System.in);
        // pattern_one(5);
        // pattern_two(5);
        // pattern_three(5);
        // pattern_four(5);
        // pattern_five(5);
        // pattern_seven(5);
        // System.out.println();
        // pattern_eight(5);
        // System.out.println();
        // pattern_nine(5);
        // pattern_ten(5);
        // pattern_eleven(5);
        // pattern_twelve(4);
        // pattern_twentyOne(4);
        pattern_twentyTwo(4);
    }

    // public static void main(String arg[]){
    //     System.out.println("Nayan".compareTo("nayan"));
    //     //  // Declare String using literal
    //     //  String str1 = "Geeks";
        
    //     //  // Declare another String using the same literal
    //     //  String str2 = "Geeks";
         
    //     //  System.out.println(str1.charAt(0));
    //     //  System.out.println(str2.equalsIgnoreCase(str1));
    //     //  // Check if both references point to the same object
    //     //  System.out.println("str1 == str2: " + (str1 == str2)); // Should print true
 
    //     //  // Declare String using new operator
    //     //  String str3 = new String("Geeks");
         
    //     //  // Check if str3 is the same as str1
    //     //  System.out.println("str1 == str3: " + (str1 == str3)); // Should print false
 
    //     //  // Intern str3 and compare again
    //     //  String str4 = str3.intern();
    //     //  System.out.println("str1 == str4: " + (str1 == str4)); // Should print true
    //     //  System.out.println(str4.compareTo(str1));
    // }
}

// 4444444
// 4333334
// 4322234
// 43211234