class Hospital {
    protected String hospitalName = "City Hospital";

    protected void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
    }
}

class Patient extends Hospital {
    void displayDetails() {
        System.out.println("Accessing protected member from child class:");
        displayHospital();
    }
}

public class ProtectedAccessMain {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.displayDetails();
    }
}