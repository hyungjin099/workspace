package test;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        var num = getInt("1~999 중 임의의 숫자를 입력하세요: ", x -> x >=1 && x <= 999, "범위를 벗어났습니다.");
        clap(num);
    }

    private static void clap(int num) {
        var clapCount = getClapCount(num);
        System.out.printf("박수 %d번\n", clapCount);
    }

    private static int getClapCount(int num) {
        int count = 0;
        for (var item : Integer.toString(num).toCharArray()) {
            if (item == '3' || item == '6' || item == '9') {
                count++;
            }
        }
        return count;
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

    public static int getInt(String prompt, Predicate<Integer> predicate, String warn) {
        while(true) {
            var result = getInt(prompt);
            if (predicate.test(result)) {
                return result;
            }
            System.out.println(warn);
        }
    }
}
