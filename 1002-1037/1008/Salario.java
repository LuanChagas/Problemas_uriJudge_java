import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhada  = sc.nextInt();
        double valorHora = sc.nextDouble();

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f",numeroFuncionario,valorHora * horasTrabalhada);
        System.out.println();
        sc.close();
    }
}
