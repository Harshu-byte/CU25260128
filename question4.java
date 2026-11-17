import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentMarksheetMain extends JFrame implements ActionListener {
    JTextField english, maths, java, dbms, networks;
    JButton calculate;
    JLabel result;

    StudentMarksheetMain() {
        setTitle("Student Marksheet");
        setSize(400, 350);
        setLayout(new GridLayout(7, 2, 10, 10));

        add(new JLabel("English:"));
        english = new JTextField();
        add(english);

        add(new JLabel("Mathematics:"));
        maths = new JTextField();
        add(maths);

        add(new JLabel("Java:"));
        java = new JTextField();
        add(java);

        add(new JLabel("DBMS:"));
        dbms = new JTextField();
        add(dbms);

        add(new JLabel("Computer Networks:"));
        networks = new JTextField();
        add(networks);

        calculate = new JButton("Calculate Result");
        add(calculate);

        result = new JLabel("Result will appear here.");
        add(result);

        calculate.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(english.getText());
            int b = Integer.parseInt(maths.getText());
            int c = Integer.parseInt(java.getText());
            int d = Integer.parseInt(dbms.getText());
            int f = Integer.parseInt(networks.getText());

            if (a < 0 || a > 100 || b < 0 || b > 100
                    || c < 0 || c > 100 || d < 0 || d > 100
                    || f < 0 || f > 100) {
                JOptionPane.showMessageDialog(this,
                        "Enter marks between 0 and 100.");
                return;
            }

            int total = a + b + c + d + f;
            double percentage = total / 5.0;

            String grade;
            if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 75) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            String status = (a >= 33 && b >= 33 && c >= 33
                    && d >= 33 && f >= 33) ? "PASS" : "FAIL";

            result.setText("<html>Total: " + total
                    + " | Percentage: " + percentage
                    + "% | Grade: " + grade
                    + " | Status: " + status + "</html>");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid marks.");
        }
    }

    public static void main(String[] args) {
        new StudentMarksheetMain();
    }
}