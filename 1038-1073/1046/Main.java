
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int hora = (a > b || (a == b)) ? (24 - a) + b : b - a;
        System.out.printf("O JOGO DUROU %d HORA(S)", hora);
        System.out.println();
    }
}
