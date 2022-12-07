package Java0Tutor.branching.task03;

public class Main {
    static String func(int x1, int y1, int x2, int y2, int x3, int y3) {
        System.out.println("3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой\n");
        return (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0 ? "точки лежат расположены на одной прямой" : "точки не лежат расположены на одной прямой";
    }

    public static void main(String[] args) {
        System.out.println(func(112, 90, 111, 56, 56, 34));
    }
}
