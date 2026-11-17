class Medicine {
    String medicineName = "Paracetamol";
    double price = 25.50;

    void displayDetails() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Medicine m = new Medicine();

        System.out.println("Medicine: " + m.medicineName);
        System.out.println("Price: " + m.price);

        m.displayDetails();
    }
}