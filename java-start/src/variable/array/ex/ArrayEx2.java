package variable.array.ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.Arrays.*;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intValues;
        System.out.println("5개의 정수를 입력하세요");
        intValues = IntStream.range(0, 5).map(i -> scanner.nextInt()).toArray();

        System.out.println("출력");
        StringBuilder result = new StringBuilder();
        for (int intValue : intValues) {
            if (intValue == intValues[intValues.length - 1]) {
                result.append(intValue);
            } else {
                result.append(intValue).append(", ");
            }
        }
        System.out.println("result = " + result);

    }
}
