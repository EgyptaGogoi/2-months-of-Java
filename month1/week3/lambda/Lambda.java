import java.lang.*;

@FunctionalInterface
interface Printable {
    String print(String a);
}



public class Lambda {

    public static void main (String [] args) {
        Printable lambda = s -> "Meao"+s;
        printhing(lambda);
    }

    static void printhing(Printable thing){
        System.out.println(thing.print("!"));
    }
}