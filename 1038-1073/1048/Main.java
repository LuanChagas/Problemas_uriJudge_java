import java.util.Locale;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        sc.close();

        BiFunction<Double, Integer, String> calc = (sal, perc) -> {
            double novo = sal + (sal * ((double) perc / 100));
            double reaj = (sal * ((double) perc / 100));
            String str = reajuste(novo, perc, reaj);
            return str;
        };

        String resultado = salario <= 400 ? calc.apply(salario, 15) : "";
        resultado = salario >= 400.01 && salario <= 800 ? calc.apply(salario, 12) : resultado;
        resultado = salario >= 800.01 && salario <= 1200 ? calc.apply(salario, 10) : resultado;
        resultado = salario >= 1200.01 && salario <= 2000 ? calc.apply(salario, 7) : resultado;
        resultado = salario > 2000 ? calc.apply(salario, 4) : resultado;

        System.out.println(resultado);

    }

    static String reajuste(double n, int perc, double reaj) {
        StringBuilder str = new StringBuilder();
        return str.append(String.format("Novo salario: %.2f\n", n))
                .append(String.format("Reajuste ganho: %.2f\n", reaj))
                .append(String.format("Em percentual: %d %%", perc)).toString();
    }
}