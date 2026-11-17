public class Question13 {
    static class SingleSlotBuffer {
        private int value;
        private boolean available = false;

        public synchronized void produce(int number) throws InterruptedException {
            while (available) {
                wait();
            }

            value = number;
            available = true;
            System.out.println("Produced: " + number);
            notifyAll();
        }

        public synchronized int consume() throws InterruptedException {
            while (!available) {
                wait();
            }

            int number = value;
            available = false;
            System.out.println("Consumed: " + number);
            notifyAll();
            return number;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SingleSlotBuffer buffer = new SingleSlotBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.produce(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Consumer");

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Producer-consumer task completed.");
    }
}
