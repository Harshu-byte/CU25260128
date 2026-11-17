class MedicineProduct {
    private String medicineName;
    private double price;
    private int quantity;

    public void setDetails(String medicineName, double price, int quantity) {
        this.medicineName = medicineName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotal() {
        return price * quantity;
    }
}

public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct m = new MedicineProduct();

        m.setDetails("Paracetamol", 10, 5);

        System.out.println("Medicine: " + m.getMedicineName());
        System.out.println("Price: " + m.getPrice());
        System.out.println("Quantity: " + m.getQuantity());
        System.out.println("Total: " + m.calculateTotal());
    }
}