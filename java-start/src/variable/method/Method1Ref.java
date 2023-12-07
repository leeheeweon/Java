package variable.method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(1, 2);
        System.out.println("sum1 = " + sum1);

        int sum2 = add(10, 20);
        System.out.println("sum2 = " + sum2);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
