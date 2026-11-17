import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedListMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Insertion
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Insert element
        arrayList.add(1, "HTML");
        linkedList.add(1, "HTML");

        System.out.println("\nAfter Insertion:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Delete element
        arrayList.remove("Python");
        linkedList.remove("Python");

        System.out.println("\nAfter Deletion:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Get element
        System.out.println("\nArrayList get(1): " + arrayList.get(1));
        System.out.println("LinkedList get(1): " + linkedList.get(1));

        // Size
        System.out.println("\nArrayList Size: " + arrayList.size());
        System.out.println("LinkedList Size: " + linkedList.size());

        // Iteration
        System.out.println("\nArrayList Iteration:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("\nLinkedList Iteration:");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}