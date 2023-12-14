package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {

        System.out.println("JavaMemoryMain1.main start");
        method1(10);
        System.out.println("JavaMemoryMain1.main end");
    }

    static void method1(int m1) {
        System.out.println("JavaMemoryMain1.method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("JavaMemoryMain1.method1 end");
    }

    static void method2(int m2) {
        System.out.println("JavaMemoryMain1.method2 start");
        System.out.println("JavaMemoryMain1.method2 end");
    }
}
