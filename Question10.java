public class Question10 {
    static class BankAccount {
        private int balance = 10000;

        // Intentionally not synchronized to demonstrate a race condition.
        public void withdraw(int amount) {
            if (balance >= amount) {
                int currentBalance = balance;

                // Gives another thread a chance to read the same old balance.
                Thread.yield();

                balance = currentBalance - amount;
            }
        }

        public int getBalance() {
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

        System.out.println("Expected balance if all withdrawals were applied: 8000");
        System.out.println("Actual final balance: " + account.getBalance());
        System.out.println("The result may be incorrect because withdraw() is not synchronized.");
    }
}
