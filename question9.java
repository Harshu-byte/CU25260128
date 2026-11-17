import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorModificationMain {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");

        ListIterator<String> iterator = students.listIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.equals("Amit")) {
                iterator.set("Suresh");
                iterator.add("Neha");
            }
        }

        System.out.println("Modified List: " + students);
    }
}