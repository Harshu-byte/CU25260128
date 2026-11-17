import java.util.ArrayList;

public class UpdateStudentMain {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");

        System.out.println("Original List: " + students);

        students.set(1, "Suresh");
        students.remove(3);

        System.out.println("Updated List: " + students);
    }
}