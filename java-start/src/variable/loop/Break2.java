package variable.loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; ; ) {
            sum += 1;

            if (sum > 10) {
                break;
            }

            System.out.println("sum = " + sum);
        }
    }
}
