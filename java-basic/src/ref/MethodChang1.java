package ref;

public class MethodChang1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        changePrimitive(10);
        System.out.println("a = " + a);
    }

    public static void changePrimitive(int x) {
        x = 20;
    }

}
