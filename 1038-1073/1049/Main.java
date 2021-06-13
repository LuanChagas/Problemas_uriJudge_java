
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        sc.close();

        String saida;
        saida = a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro") ? "aguia" : "";
        saida = a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro") ? "pomba" : saida;

        saida = a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro") ? "homem" : saida;
        saida = a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro") ? "vaca" : saida;

        saida = a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago") ? "pulga" : saida;
        saida = a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro") ? "lagarta" : saida;

        saida = a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago") ? "sanguessuga" : saida;
        saida = a.equals("invertebrado") && b.equals("anelideo") && c.equals("onivoro") ? "minhoca" : saida;

        System.out.println(saida);

    }
}
