package Java0Tutor.branching.task01;

public class Main {
    static String func(int a, int b) {
        System.out.println("1.Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. \n");
        int c = Math.abs(180 - (a + b)); // Math.abs дает модуль
        if (a + b + c == 180 && a != 0 && b != 0 && c != 0)
            return "Треугольник существует";
        else if ((a == 90 && b == 90))
            return "Треугольник существует и он прямоугольный";
        else
            return "Треугольник не существует";
    }

    public static void main(String[] args) {
        System.out.println(func(0, 90));
    }
}
