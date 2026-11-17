public class Question8 {
    public static void main(String[] args) {
        Thread highPriority = new Thread(() ->
                System.out.println("High-priority thread is running."),
                "High-Priority");

        Thread lowPriority = new Thread(() ->
                System.out.println("Low-priority thread is running."),
                "Low-Priority");

        highPriority.setPriority(Thread.MAX_PRIORITY);
        lowPriority.setPriority(Thread.MIN_PRIORITY);

        System.out.println(highPriority.getName() + " priority: "
                + highPriority.getPriority());
        System.out.println(lowPriority.getName() + " priority: "
                + lowPriority.getPriority());

        highPriority.start();
        lowPriority.start();
    }
}
