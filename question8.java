class BankAccount {
    private int accountNumber;
    private double balance;

    public void setAccountDetails(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountDetails(12345, 5000);

        account.deposit(2000);
        account.withdraw(1500);
        account.displayBalance();
    }
}