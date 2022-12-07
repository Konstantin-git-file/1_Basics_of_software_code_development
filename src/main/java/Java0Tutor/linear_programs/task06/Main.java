package Java0Tutor.linear_programs.task06;

public class Main {

    static String func(int x, int y) {

        System.out.println("6.Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае");

        if (-4 <= x && x <= 4 && -3 <= y && y <= 0 || -2 <= x && x <= 2 && 0 <= y && y <= 4) {
            return "true";
        } else
            return "false";
    }

    public static void main(String[] args) {
        System.out.println(func(5, 6));
    }
}
