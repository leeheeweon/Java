package variable.loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println(" i=시작 " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("j = " + j);
            }
            System.out.println(" i=종료 " +i);
        }
    }
}
