import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int ano = 0, mes = 0, dia = 0;
        while (idade > 0) {
            if (idade >= 365) {
                ano++;
                idade -= 365;
            } else if (idade >= 30) {
                mes++;
                idade -= 30;
            } else {
                dia++;
                idade--;
            }
        }
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " meses(es)");
        System.out.println(dia + " dia(s)");
        sc.close();
    }
}
