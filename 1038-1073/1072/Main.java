import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int countIn = 0;
    static int countout = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();

        List<Integer> vet = new ArrayList<Integer>();
        for (var i = 0; i < num; i++) {
            var val = sc.nextInt();
            vet.add(val);
        }
        sc.close();
        vet.forEach(x -> {
            if (x >= 10 && x <= 20) {
                countIn++;
            } else {
                countout++;
            }

        });
        System.out.println(countIn + " in");
        System.out.println(countout + " out");
    }
}
