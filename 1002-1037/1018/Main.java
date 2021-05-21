import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;
        System.out.println(valor);
        while (valor > 0) {
            if (valor >= 100) {
                cem++;
                valor -= 100;
            } else if (valor >= 50) {
                cinquenta++;
                valor -= 50;
            } else if (valor >= 20) {
                vinte++;
                valor -= 20;
            } else if (valor >= 10) {
                dez++;
                valor -= 10;
            } else if (valor >= 5) {
                cinco++;
                valor -= 5;
            } else if (valor >= 2) {
                dois++;
                valor -= 2;
            } else {
                um++;
                valor -= 1;
            }
        }

        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

        sc.close();
    }
}