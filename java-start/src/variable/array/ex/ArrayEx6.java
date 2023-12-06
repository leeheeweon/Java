package variable.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요.");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int minNumber;
        int maxNumber;
        System.out.println(count + "개의 정수를 입력하세요:");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        minNumber = Arrays.stream(numbers).min().getAsInt();
        maxNumber = Arrays.stream(numbers).max().getAsInt();
        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);
    }
}
