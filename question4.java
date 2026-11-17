import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Division: " + (a / b));

            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter array index (0-4): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Array element: " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }

        sc.close();
    }
}s