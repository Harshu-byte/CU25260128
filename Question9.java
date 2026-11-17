public class Question9 {
    public static void main(String[] args) throws InterruptedException {
        int[] priorities = {1, 3, 5, 7, 10};
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            final int threadNumber = i + 1;

            threads[i] = new Thread(() -> {
                for (int j = 1; j <= 5; j++) {
                    System.out.println(Thread.currentThread().getName()
                            + " (priority " + Thread.currentThread().getPriority()
                            + ") - message " + j);
                }
            }, "Thread-" + threadNumber);

            threads[i].setPriority(priorities[i]);
        }

        for (Thread thread : threads) {
            System.out.println(thread.getName() + " priority: "
                    + thread.getPriority());
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("All threads completed. Thread priority does not guarantee execution order.");
    }
}
