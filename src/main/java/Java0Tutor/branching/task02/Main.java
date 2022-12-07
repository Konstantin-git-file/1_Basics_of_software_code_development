package Java0Tutor.branching.task02;

public class Main {
    static int func(int a, int b, int c, int d) {
        System.out.println("2. Найти max{min(a, b), min(c, d)}.\n");
        return Math.max(Math.min(a, b), Math.min(c, d));
    }

    public static void main(String[] args) {
        System.out.println(func(112, 90, 111, 56));
    }
}
