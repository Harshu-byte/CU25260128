import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorReportMain {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");
        courses.add("Database");

        ListIterator<String> iterator = courses.listIterator();

        System.out.println("Forward Traversal:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println("Next Index: " + iterator.nextIndex());
        }

        System.out.println("\nBackward Traversal:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
            System.out.println("Previous Index: "
                    + iterator.previousIndex());
        }
    }
}