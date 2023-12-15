package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("JavaMemoryMain2.main start");
        method1();
        System.out.println("JavaMemoryMain2.main end");
    }

    private static void method1() {
        System.out.println("JavaMemoryMain2.method1 start");
        Data data = new Data(10);
        method2(data);
        System.out.println("JavaMemoryMain2.method1 end");
    }

    private static void method2(Data data) {
        System.out.println("JavaMemoryMain2.method2 start");
        System.out.println("data = " + data.getValue());
        System.out.println("JavaMemoryMain2.method2 end");

    }
}
