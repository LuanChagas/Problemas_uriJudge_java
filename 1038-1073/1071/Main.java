import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        var num2 = sc.nextInt();
        sc.close();

        BiFunction<Integer, Integer, Integer> calc = (a, b) -> {
            int finale = 0;
            for (var i = a; i < b; i++) {
                if (i % 2 != 0 && i != a) {
                    finale += i;
                }
            }
            return finale;
        };
        var resultado = num > num2 ? calc.apply(num2, num) : calc.apply(num, num2);
        System.out.println(resultado);
    }
}
