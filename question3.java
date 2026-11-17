class Pharmacy {
    String pharmacyName;
    String location;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
    }

    void displayDetails() {
        System.out.println("Pharmacy Name: " + pharmacyName);
        System.out.println("Location: " + location);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("Health Care Pharmacy", "Roorkee");

        p1.displayDetails();
    }
}