package Java0Tutor.circles.task01;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static void func() {
        System.out.println("1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.");
        System.out.println("Введите любое целое положительное число: \n");

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext("\\d+(\\.\\d+)?")) {
            int x = scanner.nextInt();
            int z = IntStream
                    .rangeClosed(1, x)
                    .sum();
            System.out.println("Сумма всех чисел от 1 до введенного числа равна: " + z);
        } else
            System.out.println("Вы ввели не целое положительное число!");
    }

    public static void main(String[] args) {
        func();
    }
}
