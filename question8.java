import java.util.LinkedList;

public class LinkedListQueueMain {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("Rahul");
        students.addLast("Amit");
        students.addLast("Priya");
        students.addFirst("Neha");

        System.out.println("Student Queue: " + students);

        students.removeFirst();
        System.out.println("After removeFirst(): " + students);

        students.removeLast();
        System.out.println("After removeLast(): " + students);
    }
}