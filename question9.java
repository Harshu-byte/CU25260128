import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentFeedbackMain extends JFrame implements ActionListener {

    JTextField name, roll, course;
    JRadioButton excellent, veryGood, good, average, poor;
    JCheckBox teaching, laboratory, material, assignments;
    JTextArea comments;
    JButton submit, reset;

    StudentFeedbackMain() {
        setTitle("Student Feedback Form");
        setSize(500, 550);
        setLayout(new GridLayout(9, 2, 10, 10));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Roll Number:"));
        roll = new JTextField();
        add(roll);

        add(new JLabel("Course:"));
        course = new JTextField();
        add(course);

        add(new JLabel("Rating:"));

        excellent = new JRadioButton("Excellent");
        veryGood = new JRadioButton("Very Good");
        good = new JRadioButton("Good");
        average = new JRadioButton("Average");
        poor = new JRadioButton("Poor");

        ButtonGroup rating = new ButtonGroup();
        rating.add(excellent);
        rating.add(veryGood);
        rating.add(good);
        rating.add(average);
        rating.add(poor);

        JPanel ratingPanel = new JPanel();
        ratingPanel.add(excellent);
        ratingPanel.add(veryGood);
        ratingPanel.add(good);
        ratingPanel.add(average);
        ratingPanel.add(poor);
        add(ratingPanel);

        add(new JLabel("Feedback Subjects:"));

        teaching = new JCheckBox("Teaching");
        laboratory = new JCheckBox("Laboratory");
        material = new JCheckBox("Course Material");
        assignments = new JCheckBox("Assignments");

        JPanel subjectPanel = new JPanel();
        subjectPanel.add(teaching);
        subjectPanel.add(laboratory);
        subjectPanel.add(material);
        subjectPanel.add(assignments);
        add(subjectPanel);

        add(new JLabel("Comments:"));
        comments = new JTextArea(3, 20);
        add(new JScrollPane(comments));

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
            String rating = "Not selected";

            if (excellent.isSelected()) rating = "Excellent";
            else if (veryGood.isSelected()) rating = "Very Good";
            else if (good.isSelected()) rating = "Good";
            else if (average.isSelected()) rating = "Average";
            else if (poor.isSelected()) rating = "Poor";

            String feedback = "";

            if (teaching.isSelected()) feedback += "Teaching, ";
            if (laboratory.isSelected()) feedback += "Laboratory, ";
            if (material.isSelected()) feedback += "Course Material, ";
            if (assignments.isSelected()) feedback += "Assignments, ";

            String message = "Student Name: " + name.getText()
                    + "\nRoll Number: " + roll.getText()
                    + "\nCourse: " + course.getText()
                    + "\nRating: " + rating
                    + "\nFeedback: " + feedback
                    + "\nComments: " + comments.getText();

            JOptionPane.showMessageDialog(this, message);

        } else {
            name.setText("");
            roll.setText("");
            course.setText("");

            excellent.setSelected(false);
            veryGood.setSelected(false);
            good.setSelected(false);
            average.setSelected(false);
            poor.setSelected(false);

            teaching.setSelected(false);
            laboratory.setSelected(false);
            material.setSelected(false);
            assignments.setSelected(false);

            comments.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentFeedbackMain();
    }
}