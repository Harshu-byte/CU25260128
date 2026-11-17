import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFileMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("students.txt", true);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            String roll = sc.nextLine();

            System.out.print("Enter Marks: ");
            String marks = sc.nextLine();

            writer.write("\nStudent Name: " + name);
            writer.write("\nRoll Number: " + roll);
            writer.write("\nMarks: " + marks + "\n");

            writer.close();

            System.out.println("Student record appended successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}