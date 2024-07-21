import java.io.*;
import java.util.*;

public class trycatch {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.print(x/y);
            sc.close();
            
        } 
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}