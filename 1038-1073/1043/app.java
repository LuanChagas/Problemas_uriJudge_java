import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        var a = sc.nextDouble();
        var b = sc.nextDouble();
        var c = sc.nextDouble();
        sc.close();

        var condicao1 = b - c < a && a < b + c;
        var condicao2 = a - c < b && b < a + c;
        var condicao3 = a - b < c && c < a + b;

        var per = a + b + c;
        var area = (a + b) * c / 2;
        String resultado = (condicao1 && condicao2 && condicao3) ? 
                            String.format("Perimetro = %.1f", per) : String.format("Area = %.1f",area);
            System.out.println(resultado);
    }
}