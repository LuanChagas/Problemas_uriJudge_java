import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double valor = 0.0;
        ArrayList<ArrayList<String>> produtos = new ArrayList<>();

        produtos.add(adicionar("1", "Cachorro Quente", "4.00"));
        produtos.add(adicionar("2", "X-Salada", "4.50"));
        produtos.add(adicionar("3", "X-Bacon", "5.00"));
        produtos.add(adicionar("4", "Torrada Simples", "2.00"));
        produtos.add(adicionar("5", "Refrigerante", "1.50"));
        for (ArrayList<String> s : produtos) {
            if (Integer.parseInt(s.get(0)) == codigo) {
                valor = quantidade * Double.parseDouble(s.get(2));
            }
        }

        System.out.printf("Total: R$ %.2f", valor);
        System.out.println();

        sc.close();
    }

    private static ArrayList<String> adicionar(String a, String b, String c) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        return arr;
    }
}