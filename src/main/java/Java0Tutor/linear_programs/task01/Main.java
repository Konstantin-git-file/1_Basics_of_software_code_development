package Java0Tutor.linear_programs.task01;

public class Main {

    static int func(int a, int b, int c) {

        System.out.println("1.Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.\n");

        int z = ((a - 3) * b / 2) + c;
        return z;
    }

    public static void main(String[] args) {
        System.out.println(func(10, 20, 30));
    }
}
