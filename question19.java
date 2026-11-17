class HospitalStaff {
    String name;
    double salary;

    HospitalStaff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Doctor extends HospitalStaff {
    String specialization;

    Doctor(String name, double salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Doctor d = new Doctor("Amit", 60000, "Cardiology");

        d.displayDoctor();
    }
}