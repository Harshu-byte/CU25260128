import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeManagementMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("employees.txt");

            FileWriter writer = new FileWriter(file, true);

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            String salary = sc.nextLine();

            writer.write(id + "," + name + "," + department + "," + salary
                    + "\n");

            writer.close();

            System.out.print("\nEnter Employee ID to search: ");
            String searchID = sc.nextLine();

            if (!file.exists()) {
                System.out.println("Employee file does not exist.");
                return;
            }

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",", -1);

                if (details.length == 4 && details[0].equals(searchID)) {
                    System.out.println("\nEmployee Record Found:");
                    System.out.println("Employee ID: " + details[0]);
                    System.out.println("Employee Name: " + details[1]);
                    System.out.println("Department: " + details[2]);
                    System.out.println("Salary: " + details[3]);

                    found = true;
                    break;
                }
            }

            reader.close();

            if (!found) {
                System.out.println("Employee record not found.");
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}