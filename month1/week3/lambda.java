// Question link:https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true

import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }


   // Write your code here
    // PerformOperation isOdd = a -> {return a%2 == 1;};
    
    
    
    PerformOperation isOdd() { 
        return (a) -> a%2 == 1;
    }
    PerformOperation isPrime() { 
        return (a) -> {
            for(int i = 2; i <a;i++)
                if(a%i == 0)
                    return false;
            return true;
        };
    }
    PerformOperation isPalindrome() { 
        return (a) -> {
            int b,temp, remainder;
            b = a;
            temp = 0;
            while(b>0){
                remainder = b%10;
                temp = (temp*10)+remainder;
                b /= 10;
            }
            if(temp == a)
                return true;
            return false;
        };
    }
    // PerformOperation isPrime = a -> {return a%2 == 1;};
    // PerformOperation isPalindrome = a -> {return a%2 == 1;};
}

public class lambda {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}