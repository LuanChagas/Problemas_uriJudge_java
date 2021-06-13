import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        String posicao = "Origem";

        posicao = ((X > 0) && (Y > 0)) ? "Q1" : posicao;
        posicao = ((X > 0) && (Y < 0)) ? "Q4" : posicao;
        posicao = ((X < 0) && (Y > 0)) ? "Q2" : posicao;
        posicao = ((X < 0) && (Y < 0)) ? "Q3" : posicao;
        posicao = ((X != 0) && (Y == 0)) ? "Eixo X" : posicao;
        posicao = ((X == 0) && (Y != 0)) ? "Eixo Y" : posicao;

        System.out.println(posicao);
        
        sc.close();
    }
}