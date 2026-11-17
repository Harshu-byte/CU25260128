import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverterMain extends JFrame
        implements ActionListener {

    JTextField temperature;
    JRadioButton celsius, fahrenheit;
    JButton convert, clear;
    JLabel result;

    TemperatureConverterMain() {
        setTitle("Temperature Converter");
        setSize(400, 250);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Enter Temperature:"));
        temperature = new JTextField();
        add(temperature);

        add(new JLabel("Conversion Type:"));

        celsius = new JRadioButton("Celsius to Fahrenheit", true);
        fahrenheit = new JRadioButton("Fahrenheit to Celsius");

        ButtonGroup group = new ButtonGroup();
        group.add(celsius);
        group.add(fahrenheit);

        JPanel panel = new JPanel();
        panel.add(celsius);
        panel.add(fahrenheit);
        add(panel);

        convert = new JButton("Convert");
        clear = new JButton("Clear");

        add(convert);
        add(clear);

        result = new JLabel("Result will appear here.");
        add(result);

        convert.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                double temp = Double.parseDouble(temperature.getText());
                double answer;

                if (celsius.isSelected()) {
                    answer = (temp * 9 / 5) + 32;
                    result.setText("Fahrenheit: " + answer + " °F");
                } else {
                    answer = (temp - 32) * 5 / 9;
                    result.setText("Celsius: " + answer + " °C");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Please enter a valid temperature.");
            }
        } else {
            temperature.setText("");
            result.setText("Result will appear here.");
            celsius.setSelected(true);
        }
    }

    public static void main(String[] args) {
        new TemperatureConverterMain();
    }
}