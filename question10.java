class Patient {
    private String patientName;
    private int age;

    public void setDetails(String patientName, int age) {
        this.patientName = patientName;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {
        Patient p = new Patient();

        p.setDetails("Amit", 30);
        p.displayDetails();
    }
}