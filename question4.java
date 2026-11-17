import java.util.HashSet;

public class UniqueDepartmentsMain {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();

        departments.add("Computer Science");
        departments.add("Mechanical");
        departments.add("Electrical");
        departments.add("Computer Science");
        departments.add("Civil");
        departments.add("Mechanical");

        System.out.println("Unique Departments:");

        for (String department : departments) {
            System.out.println(department);
        }
    }
}