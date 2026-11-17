import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterCountMain {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("input.txt");

            writer.write("Java Programming 123\n");
            writer.write("File Handling Example 456");

            writer.close();

            FileReader reader = new FileReader("input.txt");

            int ch;
            int vowels = 0;
            int consonants = 0;
            int digits = 0;
            int spaces = 0;

            while ((ch = reader.read()) != -1) {
                char c = (char) ch;

                if (Character.isLetter(c)) {
                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Character.isDigit(c)) {
                    digits++;
                } else if (c == ' ') {
                    spaces++;
                }
            }

            reader.close();

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}