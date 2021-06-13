import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> num = new ArrayList<Double>();
        for (var i = 0; i < 6; i++) {
            var val = sc.nextDouble();
            num.add(val);
        }
        sc.close();
        var soma = num.stream().filter(x -> x > 0).reduce((x, y) -> x + y);
        long countPlus = num.stream().filter(x -> x > 0).count();
        double media = soma.get() / countPlus;
        System.out.println(num.stream().filter(x -> x > 0).count() + " valores positivos");
        System.out.printf("%.1f", media);
        System.out.println();

    }
}
