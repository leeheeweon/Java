package variable.scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.print("숫자를 입력하세요(exit:-1)");
        while (true) {
            int num1 = scanner.nextInt();

            if (num1 == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum += num1;
            count++;

        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + (double) sum / count);
    }
}
