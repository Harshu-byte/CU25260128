import java.util.TreeSet;

public class SortedStudentIDsMain {
    public static void main(String[] args) {
        TreeSet<Integer> studentIDs = new TreeSet<>();

        studentIDs.add(105);
        studentIDs.add(102);
        studentIDs.add(108);
        studentIDs.add(101);
        studentIDs.add(105);
        studentIDs.add(104);
        studentIDs.add(103);

        System.out.println("Unique Sorted IDs: " + studentIDs);

        System.out.println("First ID: " + studentIDs.first());
        System.out.println("Last ID: " + studentIDs.last());
        System.out.println("Higher than 103: " + studentIDs.higher(103));
        System.out.println("Lower than 105: " + studentIDs.lower(105));
    }
}