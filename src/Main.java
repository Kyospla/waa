import java.util.*;

public class Main {
    private static int gcd(int lhs, int rhs) {
        if (lhs == 0) {
            return rhs;
        }
        return gcd(rhs % lhs, lhs);
    }

    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        System.out.print("Input k: ");
        int k = sc.nextInt();
        System.out.printf("gcd(n, k): %d\n", gcd(n, k));
    }
}
