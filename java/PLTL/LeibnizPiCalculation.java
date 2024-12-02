import java.util.Scanner;

public class LeibnizPiCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("N \t\t Pi");
        System.out.println("-----------------------------");
        for (int i = 0; i <= n; i += 100) {
            System.out.println(i + "\t\t" + getLeibniz(i));
        }
        input.close();
    }

    public static double getNumerator(int k) {
        double num = Math.pow(-1, k);
        return num;
    }

    public static double getDenominator(int k) {
        double num = 2 * k + 1;
        return num;
    }

    public static double getLeibniz(int n) {
        double sigma = 0.0;
        for (int k = 0; k <= n; k++) {
            sigma += (4 * getNumerator(k)) / getDenominator(k);
        }

        return sigma;
    }
}