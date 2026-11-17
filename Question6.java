import java.util.concurrent.CountDownLatch;

public class Question6 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch started = new CountDownLatch(1);

        Thread worker = new Thread(() -> {
            started.countDown();
            try {
                Thread.sleep(1000);
                System.out.println("Worker thread is doing its task.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Worker");

        System.out.println("Before start: " + worker.isAlive());

        worker.start();
        started.await();

        System.out.println("While running: " + worker.isAlive());

        worker.join();
        System.out.println("After finish: " + worker.isAlive());
    }
}
