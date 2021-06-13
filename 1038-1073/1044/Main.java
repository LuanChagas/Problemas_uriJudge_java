import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var a = sc.nextInt();
        var b = sc.nextInt();
        sc.close();

        String mult = (a % b == 0 || b % a == 0) ? "Sao Multiplos" : "Nao sao Multiplos";

        System.out.println(mult);
    }
}
