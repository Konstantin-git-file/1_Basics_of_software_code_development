package Java0Tutor.linear_programs.task05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. " +
                "Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            int hours = input / 3600;
            int minutes = (input % 3600) / 60;
            int seconds = ((input % 3600)) % 60;
            System.out.println("Исходная длительность в секундах: " + input);
            System.out.println("Исходная длительность в форме \"НН ч ММ мин SS c\" равна " + hours + " ч. " + minutes + " мин. " + seconds + " c.");
        } else
            System.out.println("Вы ввели не натуральное число!");
    }
}


