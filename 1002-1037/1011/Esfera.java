import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double pi = 3.14159;
        double raio = sc.nextDouble();

        double volume = (4.0 / 3) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();

        sc.close();
    }
}
