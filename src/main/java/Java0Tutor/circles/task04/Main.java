package Java0Tutor.circles.task04;

import java.util.stream.IntStream;

public class Main {
    static long func() {
        System.out.println("4. Составить программу нахождения произведения квадратов первых двухсот чисел.\n");
        return IntStream
                .rangeClosed(1, 200)
                .mapToLong(i -> (i * i))
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        func();
    }
}
