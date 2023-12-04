package variable.loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;


        for (int i = 1; ;i++) {
            sum += 1;

            if (sum > 10) {
                break;
            }

            System.out.println("sum = " + sum);
        }
    }
}
