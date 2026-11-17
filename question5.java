class Medicine {
    String medicineName;
    int minimumAge;

    Medicine(String medicineName, int minimumAge) {
        this.medicineName = medicineName;
        this.minimumAge = minimumAge;
    }

    void checkEligibility(int patientAge) {
        System.out.println("Medicine: " + medicineName);

        if (patientAge >= minimumAge) {
            System.out.println("Patient is eligible.");
        } else {
            System.out.println("Patient is not eligible.");
        }
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine m1 = new Medicine("Medicine A", 18);

        m1.checkEligibility(25);
    }
}