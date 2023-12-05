package variable.scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("0이면 종료합니다.");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += number;
        }
        System.out.println("sum = " + sum);
    }
}
