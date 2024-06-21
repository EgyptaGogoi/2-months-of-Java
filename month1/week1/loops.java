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

    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        pattern_one(5);
        pattern_two(5);
        pattern_three(5);
        pattern_four(5);
    }
}
