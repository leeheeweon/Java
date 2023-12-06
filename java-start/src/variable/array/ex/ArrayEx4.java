package variable.array.ex;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average;
        System.out.println("5개의 정수를 입력하세요:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / 5;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
