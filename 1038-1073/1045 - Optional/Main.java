import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var a = sc.nextDouble();
        var b = sc.nextDouble();
        var c = sc.nextDouble();
        sc.close();

        List<Double> lista = Arrays.asList(a, b, c);
        Collections.sort(lista);
        Collections.reverse(lista);

        a = lista.get(0);
        b = lista.get(1);
        c = lista.get(2);

        Optional<String> ehTriangulo = a >= b + c ? Optional.of("NAO FORMA TRIANGULO") : Optional.empty();
        Optional<String> ehTrianguloRet = Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)
                ? Optional.of("TRIANGULO RETANGULO")
                : Optional.empty();
        Optional<String> ehTrianguloObt = Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)
                ? Optional.of("TRIANGULO OBTUSANGULO")
                : Optional.empty();
        Optional<String> ehTrianguloAcu = Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)
                ? Optional.of("TRIANGULO ACUTANGULO")
                : Optional.empty();
        Optional<String> ehTrianguloEqui = (a == b && b == c) ? Optional.of("TRIANGULO EQUILATERO") : Optional.empty();
        Optional<String> ehTrianguloIso = (a == b && b != c || b == c && b != a) ? Optional.of("TRIANGULO ISOSCELES")
                : Optional.empty();

        if (!ehTriangulo.isPresent()) {
            ehTrianguloRet.ifPresent(System.out::println);
            ehTrianguloObt.ifPresent(System.out::println);
            ehTrianguloAcu.ifPresent(System.out::println);
            ehTrianguloEqui.ifPresent(System.out::println);
            ehTrianguloIso.ifPresent(System.out::println);
        } else {
            ehTriangulo.ifPresent(System.out::println);
        }
    }
}
