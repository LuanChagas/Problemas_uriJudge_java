import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int MaiorAB = ((a + b + Math.abs(a - b))) / 2;

        if (MaiorAB > c) {
            System.out.println(MaiorAB + " eh o maior");
        } else
            System.out.println(c + " eh o maior");

        sc.close();
    }

}
