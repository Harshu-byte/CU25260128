import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");
        students.add("Anjali");
        students.add("Karan");
        students.add("Sneha");
        students.add("Vikas");
        students.add("Pooja");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}