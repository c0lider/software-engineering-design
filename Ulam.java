public class Ulam {
    public static void main(String[] args) {
        for (int i = 1; i <= 1_000_000; i++) {
            calculateUlam(i);
            System.out.printf("Terminated for %s%n", i);
        }
    }

    public static int calculateUlam(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return calculateUlam(n / 2);
        } else {
            return calculateUlam(3 * n + 1);
        }
    }
}