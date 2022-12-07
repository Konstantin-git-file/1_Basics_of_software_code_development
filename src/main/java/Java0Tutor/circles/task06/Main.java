package Java0Tutor.circles.task06;

public class Main {
    static void func() {
        System.out.println("6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера\n");
        char charsSigns = '\u0000';
        int charsNumber = 0;
        for (int i = 0; i <= 100; i++) {
            charsSigns++;
            charsNumber++;
            System.out.println("символ: " + charsSigns + " число: " + charsNumber);
        }
    }
    public static void main(String[] args) {
        func();
    }
}

