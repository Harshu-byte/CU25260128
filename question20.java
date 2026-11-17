class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Pharmacist extends Employee {
    String qualification;

    Pharmacist(String name, int employeeId, String qualification) {
        super(name, employeeId);
        this.qualification = qualification;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Qualification: " + qualification);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist("Rahul", 101, "B.Pharm");

        p.displayPharmacist();
    }
}