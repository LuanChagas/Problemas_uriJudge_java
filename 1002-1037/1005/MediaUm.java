import java.util.Locale;
import java.util.Scanner;

public class MediaUm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double med = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f", med);
        System.out.println("oi");
        sc.close();
}
}
