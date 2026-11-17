class Student {
    int rollNo;
    String name;
    double marks;

    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.rollNo = 101;
        s1.name = "Rahul";
        s1.marks = 85.5;

        s1.displayDetails();
    }
}