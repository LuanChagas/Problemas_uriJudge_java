import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        final double n = 3.14159;

        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        double area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);
        sc.close();

    }
}

