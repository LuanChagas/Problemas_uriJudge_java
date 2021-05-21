import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String linhaUm = sc.nextLine();
        String linhaDois = sc.nextLine();

        String[] dadosUm = linhaUm.split(" ");
        String[] dadosDois = linhaDois.split(" ");

        double pagar = Double.parseDouble(dadosUm[1]) * Double.parseDouble(dadosUm[2])
                + Double.parseDouble(dadosDois[1]) * Double.parseDouble(dadosDois[2]);

                System.out.printf("VALOR A PAGAR: R$ %.2f", pagar);
                System.out.println();
        sc.close();
    }
}
