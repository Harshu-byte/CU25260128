class Patient {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class PatientValidationMain {
    public static void main(String[] args) {
        Patient p = new Patient();

        p.setName("Rahul");
        p.setAge(25);

        System.out.println("Patient Name: " + p.getName());
        System.out.println("Patient Age: " + p.getAge());

        p.setAge(150);
    }
}