import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();

        int horas = (tempo / 60) / 60;
        int minutos = (tempo /60) % 60;
        int segundos = tempo % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
