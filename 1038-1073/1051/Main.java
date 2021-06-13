import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        sc.close();

        double sal = 0;
        sal = salario >= 2000.01 && salario <= 3000.00 ? (salario - 2000) * 0.08 : sal;
        sal = salario >= 3000.01 && salario <= 4500.00 ? (salario - 3000) * 0.18 + 1000 * 0.08 : sal;
        sal = salario >= 4500.00 ? (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * .08 : sal;

        System.out.printf(sal == 0 ? "Isento" : "R$ %.2f", sal);
        System.out.println();
    }
}