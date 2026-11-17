public class Question15 {
    private static final Object Lock1 = new Object();
    private static final Object Lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread-1 acquired Lock1");

                synchronized (Lock2) {
                    System.out.println("Thread-1 acquired Lock2");
                }
            }
        }, "Thread-1");

        Thread second = new Thread(() -> {
            // Both threads acquire Lock1 first, then Lock2.
            synchronized (Lock1) {
                System.out.println("Thread-2 acquired Lock1");

                synchronized (Lock2) {
                    System.out.println("Thread-2 acquired Lock2");
                }
            }
        }, "Thread-2");

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println("Both threads completed without deadlock.");
    }
}
