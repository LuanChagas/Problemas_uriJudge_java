import java.util.Scanner;

public class GastosCombustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int vm = sc.nextInt();

        double litros = Double.valueOf(vm * tempo) / 12;
         System.out.printf("%.3f", litros);
        System.out.println();

        sc.close();
    }
}
