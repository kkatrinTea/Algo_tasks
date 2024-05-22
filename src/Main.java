import java.util.Scanner;

public class Main {

    public static int compareSegments(int x1, int y1, int x2, int y2) {
        if ((x2 >= y1 && x2 <= x1) || (y2 >= y1 && y2 <= x1) ||
                (x1 >= y2 && x1 <= x2) || (y1 >= y2 && y1 <= x2)) {
            return Math.max(x1, x2) - Math.min(y1, y2) + 1;
        } else {
            return x1 - y1 + x2 - y2 + 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int v = scanner.nextInt();
        int q = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(compareSegments(p + v, p - v, q + m, q - m));
    }
}
