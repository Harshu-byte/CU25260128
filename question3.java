public class Question3 {
    public static void main(String[] args) {
        String str = "123";

        try {
            int number = Integer.parseInt(str);
            System.out.println("Integer value: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid integer string.");
        }
    }
}