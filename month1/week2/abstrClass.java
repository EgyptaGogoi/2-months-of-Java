import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    void setTitle(String s){
        title=s;
    }
}
public class abstrClass {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */         Book new_novel=new MyBook(); 
           Scanner sc=new Scanner(System.in);
           String title=sc.nextLine();
           new_novel.setTitle(title);
           System.out.print("The title is: " +new_novel.getTitle());
    }
}
