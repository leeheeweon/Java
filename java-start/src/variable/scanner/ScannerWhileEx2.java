package variable.scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요(exit:-1)");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


            System.out.print("수량을 입력하세요:");
            int quantity = scanner.nextInt();
            System.out.println("총 비용 : " + (price * quantity));
        }
    }
}
