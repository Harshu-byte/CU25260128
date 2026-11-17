public class Question3 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println("Current thread name: " + mainThread.getName());
        System.out.println("Current thread priority: " + mainThread.getPriority());

        mainThread.setName("MyMainThread");

        System.out.println("Changed thread name: " + mainThread.getName());
    }
}
