import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearchMain {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("Web Development");
        courses.add("Database Management");

        Scanner sc = new Scanner(System.in);

        System.out.println("Available Courses: " + courses);
        System.out.print("Enter course name to search: ");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course exists in the list.");
        } else {
            System.out.println("Course not found.");
        }

        sc.close();
    }
}