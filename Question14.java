public class Question14 {
    private static final Object Lock1 = new Object();
    private static final Object Lock2 = new Object();

    public static void main(String[] args) {
        Thread first = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread-1 acquired Lock1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Thread-1 waiting for Lock2");
                synchronized (Lock2) {
                    System.out.println("Thread-1 acquired Lock2");
                }
            }
        }, "Thread-1");

        Thread second = new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Thread-2 acquired Lock2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Thread-2 waiting for Lock1");
                synchronized (Lock1) {
                    System.out.println("Thread-2 acquired Lock1");
                }
            }
        }, "Thread-2");

        first.start();
        second.start();

        // This program is intentionally designed to deadlock.
        // Stop it manually after observing the waiting threads.
    }
}
