class Hospital {
    protected String hospitalName = "City Hospital";

    protected void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
    }
}

class MedicalStaff extends Hospital {
    private String staffName;
    private String department;

    public void setDetails(String staffName, String department) {
        this.staffName = staffName;
        this.department = department;
    }

    public void displayDetails() {
        displayHospital();
        System.out.println("Staff Name: " + staffName);
        System.out.println("Department: " + department);
    }
}

public class MedicalStaffMain {
    public static void main(String[] args) {
        MedicalStaff staff = new MedicalStaff();

        staff.setDetails("Rahul", "Emergency");

        staff.displayDetails();
    }
}