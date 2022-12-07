package Java0Tutor.circles.task02;

import java.util.Scanner;

public class Main {
    static void func(int a, int b, int h, int x) {
        System.out.println("4. Вычислить значения функции на отрезке [а,b] c шагом h:\n");
        int y;
        for (int i = a; i <= b; i += h) {
            if (x > 2) {
                y = i + x;
            } else {
                y = i - x;
            }
            System.out.println("При шаге равным " + i + " значение функции на отрезке " + "[" + a + "," + b + "] равно: " + y);
        }
    }

    public static void main(String[] args) {
        func(1, 10, 2, 2);
    }
}
