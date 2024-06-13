 import java.util.Date;
public class index { 
    // public static void main(String args[]) 
    // { 
    //     System.out.println("Hello World"); 
    // } 
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