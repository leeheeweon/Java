package variable.method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage(3, "Hello, world!");
        printMessage(5, "Hello, world!");
        printMessage(7, "Hello, world!");
    }

    private static void printMessage(int count, String message) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
