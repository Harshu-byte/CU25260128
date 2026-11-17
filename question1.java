import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationMain extends Frame implements ActionListener {
    TextField name, roll, course;
    Checkbox male, female;
    CheckboxGroup gender;
    Choice semester;
    Button submit, reset;
    Label result;

    StudentRegistrationMain() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setLayout(new GridLayout(8, 2, 10, 10));

        add(new Label("Student Name:"));
        name = new TextField();
        add(name);

        add(new Label("Roll Number:"));
        roll = new TextField();
        add(roll);

        add(new Label("Course:"));
        course = new TextField();
        add(course);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, true);
        female = new Checkbox("Female", gender, false);

        Panel p = new Panel();
        p.add(male);
        p.add(female);
        add(p);

        add(new Label("Semester:"));
        semester = new Choice();
        for (int i = 1; i <= 8; i++) {
            semester.add("Semester " + i);
        }
        add(semester);

        submit = new Button("Submit");
        reset = new Button("Reset");

        add(submit);
        add(reset);

        result = new Label("");
        add(result);

        submit.addActionListener(this);
        reset.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String details = "Name: " + name.getText()
                    + ", Roll: " + roll.getText()
                    + ", Course: " + course.getText()
                    + ", Gender: " + gender.getSelectedCheckbox().getLabel()
                    + ", Semester: " + semester.getSelectedItem();

            result.setText("Submitted successfully.");
            System.out.println(details);
        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            gender.setSelectedCheckbox(male);
            semester.select(0);
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationMain();
    }
}