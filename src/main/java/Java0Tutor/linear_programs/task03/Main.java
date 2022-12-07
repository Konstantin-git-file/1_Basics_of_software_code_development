package Java0Tutor.linear_programs.task03;

public class Main {

    static double func(double x, double y) {

        System.out.println("3.Вычислить значение выражения по формуле (все переменные принимают действительные значения):\n");

        double result = (Math.sin(x) + Math.cos(y))/(Math.sin(x) - Math.cos(y)) * Math.tan(x*y);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(func(10, 20));
    }
}
