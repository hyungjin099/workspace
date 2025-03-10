package test;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        final int count = 6;
        var lotto = new int[count];

        for (int i = 0; i < count; i++) {
            lotto[i] = getRandomInt(1, 46);
        }

        Arrays.stream(lotto)
                .forEach(x -> System.out.printf("%d ", x));

        System.out.println();
    }

    public static int getRandomInt(int minInclusive, int maxExclusive) {
        return (int)(Math.random() * (maxExclusive - minInclusive) + minInclusive);
    }
}
