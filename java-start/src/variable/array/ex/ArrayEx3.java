package variable.array.ex;

import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intValues;
        System.out.println("5개의 정수를 입력하세요");
        intValues = IntStream.range(0, 5).map(i -> scanner.nextInt()).toArray();

        System.out.println("출력");
        for (int i = 4; i >= 0; i--) {
            System.out.print(intValues[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
