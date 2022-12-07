package Java0Tutor.branching.task04;

public class Main {
    static String func(int a, int b, int x, int y, int z) {
        System.out.println("4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.\n");
        if ((a >= y && b >= x || a >= x && b >= y))
            return "Кирпич пройдет";
        else
            return "Кирпич не пройдет";
    }

    public static void main(String[] args) {
        System.out.println(func(10, 90, 111, 56, 56));
    }
}
