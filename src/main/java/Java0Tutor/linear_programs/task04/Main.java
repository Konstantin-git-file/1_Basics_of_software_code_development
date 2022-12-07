package Java0Tutor.linear_programs.task04;

public class Main {

    static double func(double x) {

        System.out.println("4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). " +
                "Поменять местами дробную и целую части числа и вывести полученное значение числа.\n ");

        int firstPart = (int) x;
        int lastPart = (int)((x - firstPart) * 1000);
        double result = lastPart + firstPart * 0.001;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(func(123.456));
    }
}
