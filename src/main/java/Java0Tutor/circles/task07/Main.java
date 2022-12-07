package Java0Tutor.circles.task07;

import java.util.Scanner;

public class Main {
    static void func() {
        System.out.println("7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.\n" +
                "m и n вводятся с клавиатуры.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите число m для начала промежутка ");
        int m = scanner.nextInt();
        System.out.println("Ввидите число n для конца промежутка ");
        int n = scanner.nextInt();

        while (m <= n) {
            System.out.print("\n число: " + m);
            System.out.print(", делители этого числа: ");
            for (int i = 2; i <= m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + ",");
                }
            }
            m += 1;
        }
    }

    public static void main(String[] args) {
        func();
    }
}

