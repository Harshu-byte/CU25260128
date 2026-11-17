public class Question2 {
    public static void main(String[] args) {
        Runnable task = () -> {
            String name = "Sarthak Goel";

            for (int i = 1; i <= 5; i++) {
                System.out.println(name);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread was interrupted.");
                    break;
                }
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
