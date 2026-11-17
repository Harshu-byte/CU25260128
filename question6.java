import java.awt.*;
import java.awt.event.*;

public class EmployeeRegistrationMain extends Frame implements ActionListener {
    TextField id, name, designation, salary;
    Choice department;
    Checkbox male, female;
    CheckboxGroup gender;
    TextArea result;
    Button submit, clear;

    EmployeeRegistrationMain() {
        setTitle("Employee Registration Form");
        setSize(450, 500);
        setLayout(new GridLayout(9, 2, 10, 10));

        add(new Label("Employee ID:"));
        id = new TextField();
        add(id);

        add(new Label("Employee Name:"));
        name = new TextField();
        add(name);

        add(new Label("Designation:"));
        designation = new TextField();
        add(designation);

        add(new Label("Salary:"));
        salary = new TextField();
        add(salary);

        add(new Label("Department:"));
        department = new Choice();
        department.add("IT");
        department.add("HR");
        department.add("Finance");
        department.add("Sales");
        add(department);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, true);
        female = new Checkbox("Female", gender, false);

        Panel genderPanel = new Panel();
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        submit = new Button("Submit");
        clear = new Button("Clear");

        add(submit);
        add(clear);

        add(new Label("Employee Details:"));
        result = new TextArea(5, 30);
        add(result);

        submit.addActionListener(this);
        clear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            try {
                Double.parseDouble(salary.getText());

                String details = "Employee ID: " + id.getText()
                        + "\nName: " + name.getText()
                        + "\nDesignation: " + designation.getText()
                        + "\nSalary: " + salary.getText()
                        + "\nDepartment: " + department.getSelectedItem()
                        + "\nGender: " + gender.getSelectedCheckbox().getLabel();

                result.setText(details);

            } catch (NumberFormatException ex) {
                result.setText("Please enter a valid salary.");
            }
        } else {
            id.setText("");
            name.setText("");
            designation.setText("");
            salary.setText("");
            department.select(0);
            gender.setSelectedCheckbox(male);
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new EmployeeRegistrationMain();
    }
}