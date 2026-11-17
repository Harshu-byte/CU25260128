public class Question7 {
    public static void main(String[] args) throws InterruptedException {
        Thread calculation = new Thread(() -> {
            long sum = 0;

            for (int i = 1; i <= 10000; i++) {
                sum += i;
            }

            System.out.println("Sum: " + sum);
        });

        calculation.start();
        calculation.join();

        System.out.println("Task finished");
    }
}
