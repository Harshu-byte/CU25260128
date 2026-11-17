import java.util.ArrayList;
import java.util.HashSet;

public class ListVsSetMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int[] values = {10, 20, 30, 10, 40, 20, 50};

        for (int value : values) {
            list.add(value);
            set.add(value);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);

        System.out.println("\nDifference:");
        System.out.println("1. ArrayList allows duplicate elements.");
        System.out.println("2. HashSet does not allow duplicates.");
        System.out.println("3. ArrayList maintains insertion order.");
        System.out.println("4. HashSet does not guarantee insertion order.");
    }
}