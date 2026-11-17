import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniBankingMain extends JFrame implements ActionListener {

    JTextField accountNumber, customerName, balance, amount;
    JButton deposit, withdraw, checkBalance, clear;

    MiniBankingMain() {
        setTitle("Mini Banking Application");
        setSize(450, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Account Number:"));
        accountNumber = new JTextField();
        add(accountNumber);

        add(new JLabel("Customer Name:"));
        customerName = new JTextField();
        add(customerName);

        add(new JLabel("Current Balance:"));
        balance = new JTextField("10000");
        balance.setEditable(false);
        add(balance);

        add(new JLabel("Amount:"));
        amount = new JTextField();
        add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        checkBalance = new JButton("Check Balance");
        clear = new JButton("Clear");

        add(deposit);
        add(withdraw);
        add(checkBalance);
        add(clear);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        checkBalance.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double currentBalance = Double.parseDouble(balance.getText());

            if (e.getSource() == deposit) {
                double value = Double.parseDouble(amount.getText());

                if (value <= 0) {
                    JOptionPane.showMessageDialog(this,
                            "Enter a positive amount.");
                    return;
                }

                currentBalance += value;
                balance.setText(String.valueOf(currentBalance));

                JOptionPane.showMessageDialog(this,
                        "Amount deposited successfully.");

            } else if (e.getSource() == withdraw) {
                double value = Double.parseDouble(amount.getText());

                if (value <= 0) {
                    JOptionPane.showMessageDialog(this,
                            "Enter a positive amount.");
                } else if (value <= currentBalance) {
                    currentBalance -= value;
                    balance.setText(String.valueOf(currentBalance));

                    JOptionPane.showMessageDialog(this,
                            "Withdrawal successful.");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Insufficient balance.");
                }

            } else if (e.getSource() == checkBalance) {
                JOptionPane.showMessageDialog(this,
                        "Account Number: " + accountNumber.getText()
                        + "\nCustomer Name: " + customerName.getText()
                        + "\nCurrent Balance: " + currentBalance);

            } else if (e.getSource() == clear) {
                accountNumber.setText("");
                customerName.setText("");
                amount.setText("");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid amount.");
        }
    }

    public static void main(String[] args) {
        new MiniBankingMain();
    }
}