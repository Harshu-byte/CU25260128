public class Question11 {
    static class BankAccount {
        private int balance = 10000;

        public synchronized void withdraw(int amount) {
            if (balance >= amount) {
                balance = balance - amount;
            }
        }

        public synchronized int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Runnable withdrawalTask = () -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(1);
            }
        };

        Thread first = new Thread(withdrawalTask, "Thread-1");
        Thread second = new Thread(withdrawalTask, "Thread-2");

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println("Expected final balance: 8000");
        System.out.println("Actual final balance: " + account.getBalance());
    }
}
