class Employee {
    String name;
    double salary;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Doctor extends Employee {
    String specialization;

    void displayDoctor() {
        displayEmployee();
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    String pharmacyName;

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Pharmacy: " + pharmacyName);
    }
}

public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.name = "Amit";
        d.salary = 50000;
        d.specialization = "Cardiology";

        Pharmacist p = new Pharmacist();
        p.name = "Rahul";
        p.salary = 30000;
        p.pharmacyName = "Health Care Pharmacy";

        System.out.println("Doctor Details:");
        d.displayDoctor();

        System.out.println("\nPharmacist Details:");
        p.displayPharmacist();
    }
}