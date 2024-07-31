import java.util.ArrayList;
import java.util.Vector;

public class alVSvl{
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Creating a Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Accessing elements from ArrayList
        for (String fruit : arrayList) {
            System.out.println("ArrayList: " + fruit);
        }

        // Accessing elements from Vector
        for (String fruit : vector) {
            System.out.println("Vector: " + fruit);
        }
    }
}
