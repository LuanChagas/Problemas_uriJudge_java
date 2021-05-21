import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = (B * B) - 4 * A * C;
        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double rone = (-B + Math.sqrt(delta)) / (2 * A);
            double rtwo = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f\n", rone);
            System.out.printf("R2 = %.5f\n", rtwo);
            System.out.println();
        }

        sc.close();
    }
}
