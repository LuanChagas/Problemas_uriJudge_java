import java.util.Locale;
import java.util.Scanner;

public class DistanciaDoisPontos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double Xum = sc.nextDouble();
        double Yum = sc.nextDouble();
        sc.nextLine();
        double Xdois = sc.nextDouble();
        double Ydois = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow((Xdois - Xum), 2) + Math.pow((Ydois - Yum), 2));
        System.out.printf("%.4f", distancia);
        System.out.println();

        sc.close();
    }
}
