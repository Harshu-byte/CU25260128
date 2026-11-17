import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Java is a programming language.\n");
            writer.write("Java is used for application development.\n");
            writer.write("Learning Java is useful.");
            writer.close();

            System.out.print("Enter word to search: ");
            String searchWord = sc.nextLine();

            BufferedReader reader =
                    new BufferedReader(new FileReader("notes.txt"));

            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z0-9]", "");

                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }

            reader.close();

            if (count > 0) {
                System.out.println("Word found.");
                System.out.println("Occurrences: " + count);
            } else {
                System.out.println("Word not found.");
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}