package Java0Tutor.circles.task05;

import java.util.stream.IntStream;

public class Main {
    static void func(double x) {
        System.out.println("5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен\n" +
                "заданному е. Общий член ряда имеет вид:\n");

        double sum = IntStream
                .iterate(0, i -> i <= 10, i -> i + 1)
                .mapToDouble(i -> 1 / Math.pow(2, i) + 1 / Math.pow(3, i))
                .filter(an -> Math.abs(an) >= 0.1)
                .sum();
        System.out.println("Сумма равна " + sum);
    }

    public static void main(String[] args) {
        func(15);
    }
}

