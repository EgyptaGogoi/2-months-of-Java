import java.lang.*;

class twopow {
    public static boolean isPowerOfTwo(int n) {
        // int prod=1;
        // while(prod!=n)
        //     prod=prod*2;
        // if(prod==n)
        //     return true;
        // return false; 
        if(n==0)
            return false;
        if(n%2==1 && n!=1)
            return false;
        if(n==1)
            return true;
        return isPowerOfTwo(n/2);
    }
    public static void main(String []Args){
        int a=1024;
        System.out.println(isPowerOfTwo(a));
    }
}