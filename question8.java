import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Division: " + (a / b));

            try {
                System.out.print("Enter array index (0-4): ");
                int index = sc.nextInt();

                System.out.println("Array element: " + arr[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array index.");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        sc.close();
    }
}