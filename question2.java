class Medicine {
    String name;
    double price;
    int quantity;

    void calculateBill() {
        double total = price * quantity;
        System.out.println("Medicine: " + name);
        System.out.println("Total Bill: " + total);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine m1 = new Medicine();

        m1.name = "Paracetamol";
        m1.price = 10;
        m1.quantity = 5;

        m1.calculateBill();
    }
}