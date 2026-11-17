import java.util.ArrayList;
import java.util.HashSet;

public class HospitalPatientMain {
    public static void main(String[] args) {
        ArrayList<String> patientNames = new ArrayList<>();
        HashSet<String> patientIDs = new HashSet<>();

        // Add patient records
        patientNames.add("Rahul");
        patientNames.add("Amit");
        patientNames.add("Priya");

        patientIDs.add("P101");
        patientIDs.add("P102");
        patientIDs.add("P103");

        // Display records
        System.out.println("Patient Names: " + patientNames);
        System.out.println("Patient IDs: " + patientIDs);

        // Search patient
        System.out.println("Is Rahul present? "
                + patientNames.contains("Rahul"));

        System.out.println("Is P102 present? "
                + patientIDs.contains("P102"));

        // Remove patient record
        patientNames.remove("Amit");
        patientIDs.remove("P102");

        // Display updated records
        System.out.println("Updated Patient Names: " + patientNames);
        System.out.println("Updated Patient IDs: " + patientIDs);
    }
}