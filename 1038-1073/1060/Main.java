import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> num = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            double val = sc.nextDouble();
            num.add(val);
        }
        sc.close();
        System.out.println(num.stream().filter(x -> x > 0).count() + " valores positivos");
    }
}
