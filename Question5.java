import java.util.concurrent.ThreadLocalRandom;

public class Question5 {
    public static void main(String[] args) {
        Thread reader = createThread("Reader", "Reading data");
        Thread writer = createThread("Writer", "Writing data");
        Thread logger = createThread("Logger", "Logging activity");

        reader.start();
        writer.start();
        logger.start();
    }

    private static Thread createThread(String threadName, String message) {
        return new Thread(() -> {
            try {
                int delay = ThreadLocalRandom.current().nextInt(501);
                Thread.sleep(delay);
                System.out.println(Thread.currentThread().getName()
                        + ": " + message + " (waited " + delay + " ms)");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(threadName + " was interrupted.");
            }
        }, threadName);
    }
}
