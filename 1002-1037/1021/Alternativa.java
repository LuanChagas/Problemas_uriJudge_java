import java.util.Locale;
import java.util.Scanner;

public class Alternativa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String valorS = sc.nextLine();
        Double valor = Double.parseDouble(valorS);

        int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;
        int cinquentaCentavos = 0, vinteCentavos = 0, dezCentavos = 0, cincOCentavos = 0, umCentavos = 0;
        System.out.println(valor);
        while (valor > 0) {
            String d = String.format("%.2f", valor);
            valor = Double.parseDouble(d);
            if (valor >= 100 ) {
                cem++;
                valor -=100;
            } else if (valor>= 50) {
                cinquenta++;
                valor -=50;
            } else if (valor >= 20) {
                vinte++;
                valor -=20;
            } else if (valor>= 10) {
                dez++;
                valor -=10;
            } else if (valor>= 5) {
                cinco++;
                valor -=5;
            } else if (valor>= 2) {
                dois++;
                valor -=2;
            } else if (valor>= 1) {
                um++;
                valor -=1;
            } else if (valor>= 0.50) {
                cinquentaCentavos++;
                valor -=0.50;
            } else if (valor>= 0.25) {
                vinteCentavos++;
                valor -=0.25;
            } else if (valor >= 0.10) {
                dezCentavos++;
                valor -=0.10;
            } else if (valor >= 0.05) {
                cincOCentavos++;
                valor -=0.05;
            } else if (valor>= 0.01) {
                umCentavos++;
                valor -=0.01;
            } else {
                valor = 0.0;
            }

        }
        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(cinquentaCentavos + " moeda(s) de R$ 0.50");
        System.out.println(vinteCentavos + " moeda(s) de R$ 0.25");
        System.out.println(dezCentavos + " moeda(s) de R$ 0.10");
        System.out.println(cincOCentavos + " moeda(s) de R$ 0.05");
        System.out.println(umCentavos + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
