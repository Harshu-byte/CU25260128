import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentCollectionMain {

    static ArrayList<String> students = new ArrayList<>();
    static HashSet<Integer> studentIDs = new HashSet<>();
    static TreeSet<Integer> sortedIDs = new TreeSet<>();

    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        if (studentIDs.add(id)) {
            students.add(name + " (ID: " + id + ")");
            sortedIDs.add(id);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student ID already exists.");
        }
    }

    static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int id = Integer.parseInt(sc.nextLine());

        if (studentIDs.remove(id)) {
            sortedIDs.remove(id);

            String record = null;

            for (String student : students) {
                if (student.endsWith("(ID: " + id + ")")) {
                    record = student;
                    break;
                }
            }

            if (record != null) {
                students.remove(record);
            }

            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = Integer.parseInt(sc.nextLine());

        if (studentIDs.contains(id)) {
            for (String student : students) {
                if (student.endsWith("(ID: " + id + ")")) {
                    System.out.println("Student Found: " + student);
                    return;
                }
            }
        }

        System.out.println("Student not found.");
    }

    static void displayStudents() {
        System.out.println("Student Records:");

        if (students.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            for (String student : students) {
                System.out.println(student);
            }
        }
    }

    static void countStudents() {
        System.out.println("Total Students: " + students.size());
        System.out.println("Unique IDs: " + studentIDs.size());
    }

    static void iterateStudents() {
        ListIterator<String> iterator = students.listIterator();

        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Backward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    static void displayCollectionTypes() {
        System.out.println("ArrayList: " + students);
        System.out.println("HashSet: " + studentIDs);
        System.out.println("TreeSet: " + sortedIDs);

        System.out.println("List maintains insertion order and allows duplicates.");
        System.out.println("Set stores unique elements.");
        System.out.println("SortedSet stores unique elements in sorted order.");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Iterate Students");
            System.out.println("7. Display Collection Types");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    removeStudent();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    displayStudents();
                    break;

                case 5:
                    countStudents();
                    break;

                case 6:
                    iterateStudents();
                    break;

                case 7:
                    displayCollectionTypes();
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }
}