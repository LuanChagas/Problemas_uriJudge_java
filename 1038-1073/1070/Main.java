import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        sc.close();
        var cont = 0;
        while (cont < 6) {
            if (num % 2 != 0) {
                System.out.println(num);
                cont++;
            }
            num++;
        }
    }
}
