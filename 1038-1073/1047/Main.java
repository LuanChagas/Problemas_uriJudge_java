import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        sc.close();

        var hora = h1 > h2 || (h1 + h2 == 0 && m1 >= m2) || (h1 == h2 && m2 <= m1) ? 24 - h1 + h2 : h2 - h1;
        hora = m1 > m2 ? hora - 1 : hora;
        var minutos = m1 > m2 ? 60 - m1 + m2 : m2 - m1;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", hora, minutos);
        System.out.println();
    }
}