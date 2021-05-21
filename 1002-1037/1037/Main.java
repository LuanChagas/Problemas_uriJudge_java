import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        int[][] inter = { { 0, 25 }, { 25, 50 }, { 50, 75 }, { 75, 100 } };
        String resultado = "";
        for (int i = 0; i < inter.length; i++) {
            if (inter[i][0] == 0) {
                resultado = (valor >= inter[i][0] && valor <= inter[i][1])
                        ? String.format("Intervalo [%d,%d]", inter[i][0], inter[i][1])
                        : resultado;
            } else {
                resultado = (valor > inter[i][0] && valor <= inter[i][1])
                        ? String.format("Intervalo (%d,%d]", inter[i][0], inter[i][1])
                        : resultado;
            }

        }

        if (resultado.equals("")) {
            System.out.println("Fora do Intervalo");
        } else {
            System.out.println(resultado);
        }

        sc.close();
    }
}