import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CourseSelectionMain extends JFrame implements ActionListener {
    JTextField name;
    JComboBox<String> course;
    JRadioButton male, female;
    JCheckBox java, python, dbms, networking;
    JButton submit, reset;

    CourseSelectionMain() {
        setTitle("Course Selection Form");
        setSize(400, 350);
        setLayout(new GridLayout(7, 2, 10, 10));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Course:"));
        course = new JComboBox<>(new String[]{
                "BCA", "BBA", "B.Tech", "MCA"
        });
        add(course);

        add(new JLabel("Gender:"));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new JLabel("Subjects:"));

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        dbms = new JCheckBox("DBMS");
        networking = new JCheckBox("Networking");

        JPanel subjectPanel = new JPanel();
        subjectPanel.add(java);
        subjectPanel.add(python);
        subjectPanel.add(dbms);
        subjectPanel.add(networking);
        add(subjectPanel);

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String gender = male.isSelected() ? "Male"
                    : female.isSelected() ? "Female" : "Not selected";

            String subjects = "";

            if (java.isSelected()) subjects += "Java ";
            if (python.isSelected()) subjects += "Python ";
            if (dbms.isSelected()) subjects += "DBMS ";
            if (networking.isSelected()) subjects += "Networking ";

            String message = "Name: " + name.getText()
                    + "\nCourse: " + course.getSelectedItem()
                    + "\nGender: " + gender
                    + "\nSubjects: " + subjects;

            JOptionPane.showMessageDialog(this, message);

        } else {
            name.setText("");
            course.setSelectedIndex(0);
            male.setSelected(false);
            female.setSelected(false);
            java.setSelected(false);
            python.setSelected(false);
            dbms.setSelected(false);
            networking.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new CourseSelectionMain();
    }
}