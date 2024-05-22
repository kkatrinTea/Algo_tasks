import java.util.HashMap;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> combinations = new HashMap<>();
        combinations.put(1, 1);
        combinations.put(2, 2);
        combinations.put(3, 2);
        combinations.put(0, 0);

        long sum = 0L;
        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            int n = scanner.nextInt();
            sum += n / 4;
            sum += combinations.get(n % 4);
        }
        System.out.println(sum);
    }
}