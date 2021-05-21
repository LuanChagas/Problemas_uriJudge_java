
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String valorS = sc.nextLine();
        BigDecimal valor = new BigDecimal(valorS);

        int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;
        int cinquentaCentavos = 0, vinteCentavos = 0, dezCentavos = 0, cincOCentavos = 0, umCentavos = 0;

        
        while (valor.compareTo(BigDecimal.ZERO)>=1) {
            if (valor.compareTo(BigDecimal.valueOf(100)) >= 0) {
                cem++;
              valor =  valor.subtract(new BigDecimal("100"));
            } else if (valor.compareTo(BigDecimal.valueOf(50)) >= 0) {
                cinquenta++;
               valor = valor.subtract(new BigDecimal("50"));
            } else if (valor.compareTo(BigDecimal.valueOf(20)) >= 0) {
                vinte++;
              valor =  valor.subtract(new BigDecimal("20"));
            } else if (valor.compareTo(BigDecimal.valueOf(20)) >= 0) {
                dez++;
               valor = valor.subtract(new BigDecimal("10"));
            } else if (valor.compareTo(BigDecimal.valueOf(5)) >= 0) {
                cinco++;
               valor = valor.subtract(new BigDecimal("5"));
            } else if (valor.compareTo(BigDecimal.valueOf(2)) >= 0) {
                dois++;
               valor = valor.subtract(new BigDecimal("2"));
            } else if (valor.compareTo(BigDecimal.valueOf(1)) >= 0) {
                um++;
               valor = valor.subtract(new BigDecimal("1"));
            } else if (valor.compareTo(BigDecimal.valueOf(0.50)) >= 0) {
                cinquentaCentavos++;
               valor = valor.subtract(new BigDecimal("0.50"));
            } else if (valor.compareTo(BigDecimal.valueOf(0.25)) >= 0) {
                vinteCentavos++;
               valor = valor.subtract(new BigDecimal("0.25"));
            } else if (valor.compareTo(BigDecimal.valueOf(0.10)) >= 0) {
                dezCentavos++;
                valor =valor.subtract(new BigDecimal("0.10"));
            } else if (valor.compareTo(BigDecimal.valueOf(0.05)) >= 0) {
                cincOCentavos++;
                valor =valor.subtract(new BigDecimal("0.05"));
            } else if(valor.compareTo(BigDecimal.valueOf(0.01)) >= 0){
                umCentavos++;
                valor =valor.subtract(new BigDecimal("0.01"));
            }else{
                valor = new BigDecimal(0.0);
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
