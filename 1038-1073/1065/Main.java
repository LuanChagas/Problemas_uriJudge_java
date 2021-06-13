import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> num = new ArrayList<Double>();
        for (var i = 0; i < 5; i++) {
            var val = sc.nextDouble();
            num.add(val);
        }
        sc.close();
        System.out.println(num.stream().filter(x -> x % 2 == 0).count() + " valores pares");
    }
}
