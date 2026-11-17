class Medicine {
    public String medicineName = "Paracetamol";
    public double price = 20;

    public void displayDetails() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Medicine m = new Medicine();

        System.out.println(m.medicineName);
        System.out.println(m.price);

        m.displayDetails();
    }
}