package test;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        int num1 = getInt("첫 번째 정수를 입력하세요: ");
        int num2 = getInt("두 번째 정수를 입력하세요: ");
        int num3 = getInt("세 번째 정수를 입력하세요: ");

        Stream.of(num1, num2, num3)
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.printf("%d ", x));

        System.out.println();
    }

    public static int getInt(String prompt) {
        var scanner = new Scanner(System.in);
        while(true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("입력값은 정수여야 합니다.");
            } finally {
                scanner.nextLine();
            }
        }
    }
}
