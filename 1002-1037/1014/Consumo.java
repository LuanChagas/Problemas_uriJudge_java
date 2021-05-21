import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double Kml = X / Y;

        System.out.printf("%.3f km/l", Kml);
        System.out.println();

        sc.close();

    }
}
