class Person {
    String name;

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.name = "Suresh";
        m.employeeId = 101;
        m.department = "Administration";

        m.displayManager();
    }
}