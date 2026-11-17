class Person {
    void displayPerson() {
        System.out.println("This is the Person class.");
    }
}

class Student extends Person {
    void displayStudent() {
        System.out.println("This is the Student class.");
    }
}

class Employee extends Person {
    void displayEmployee() {
        System.out.println("This is the Employee class.");
    }
}

public class InheritanceConceptMain {
    public static void main(String[] args) {
        Student s = new Student();
        Employee e = new Employee();

        s.displayPerson();
        s.displayStudent();

        e.displayPerson();
        e.displayEmployee();

        System.out.println("Java does not support multiple inheritance through classes.");
        System.out.println("Hybrid inheritance can be achieved using class inheritance combinations.");
    }
}