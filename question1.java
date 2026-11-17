import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWriteFileMain {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Writing to it.");
            }

            FileWriter writer = new FileWriter(file);

            writer.write("Student Name: Rahul\n");
            writer.write("Roll Number: 101\n");
            writer.write("Course: BCA\n");
            writer.write("Semester: 3");

            writer.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}