import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class regSol{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
              //public String pattern= new String("[[0-2]?[0-5]?[0-5]?]{1,4}.{1}[[0-2]?[0-5]?[0-5]?]{1,4}.{1}[[0-2]?[0-5]?[0-5]?]{1,4}.{1}[[0-2]?[0-5]?[0-5]?]{1,4}");
              public String pattern= new String("[[0-2]{0,1}[0-5[0-5]]{1,3}.{1}");
              public String pattern= new String("[[0-2]{0,1}[0-5[0-5]]{1,3}.{1}");
}
