public class Question4 {
    public static void main(String[] args) {
        Thread first = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }, "Thread-One");

        Thread second = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }, "Thread-Two");

        first.start();
        second.start();
    }
}
