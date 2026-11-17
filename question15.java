import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicine = sc.nextLine();

            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException(
                    "Quantity cannot be negative."
                );
            }

            if (required > available) {
                throw new InsufficientMedicineStockException(
                    "Insufficient medicine stock."
                );
            }

            System.out.println("Medicine: " + medicine);
            System.out.println("Available quantity: " + available);
            System.out.println("Required quantity: " + required);
            System.out.println("Inventory transaction successful.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numeric quantities.");

        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Inventory transaction completed.");
            sc.close();
        }
    }
}
