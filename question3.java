import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileCountMain {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Java is a programming language.\n");
            writer.write("Java supports file handling.\n");
            writer.write("Collections are useful.");

            writer.close();

            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            int lines = 0;
            int words = 0;
            int characters = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();

                String trimmed = line.trim();

                if (!trimmed.isEmpty()) {
                    words += trimmed.split("\\s+").length;
                }
            }

            reader.close();

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters: " + characters);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}