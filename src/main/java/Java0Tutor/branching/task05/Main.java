package Java0Tutor.branching.task05;

public class Main {
    static void func(int x) {
        System.out.println("5. Вычислить значение функции:");
        if (x <= 3) {
            System.out.println(Math.pow(x, 2) - 3 * x + 9);
        }
        if (x > 3)
            System.out.println(1 / (Math.pow(x, 3) + 6));
    }

    public static void main(String[] args) {
        func(12);
    }
}

