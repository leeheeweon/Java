package variable.scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작

        for (int i = 0; i < 2; i++) {
            System.out.println("m = " + m);
            System.out.println("i = " + i);
        }
        System.out.println("m = " + m);
//        System.out.println("i = " + i);
    }
}
