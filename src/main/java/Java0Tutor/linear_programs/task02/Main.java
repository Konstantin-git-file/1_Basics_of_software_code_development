package Java0Tutor.linear_programs.task02;

public class Main {

    static double func(double a, double b, double c) {

        System.out.println("2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):\n");

        double result = (b + ((Math.pow(b, 2)) + 4 * a * c) / (2 * a)) - ((Math.pow(a, 3)) * c) + Math.pow(b, -2);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(func(10, 20, 30));
    }
}
