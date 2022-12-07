package Java0Tutor.circles.task08;

public class Main {
    static void func(int a, int b) {
        System.out.println("8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.\n");
        int[] arr = new int[10];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.println(b % 10);
            b /= 10;

        }
    }

    public static void main(String[] args) {
        func(1322, 2134);
    }
}

