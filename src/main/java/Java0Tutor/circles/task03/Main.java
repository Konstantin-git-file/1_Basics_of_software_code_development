package Java0Tutor.circles.task03;

import java.util.stream.IntStream;

public class Main {
    static int func() {
        System.out.println("3. Найти сумму квадратов первых ста чисел.\n");
        return IntStream
                .rangeClosed(1, 100)
                .map(i -> i * i)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(func());
    }
}
