import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        
        var valor1 = sc.nextInt();
        var valor2 = sc.nextInt();
        var valor3 = sc.nextInt();
        sc.close();
        int[] arr1 = {valor1,valor2,valor3};
        int[] arr2 = arr1.clone();
        Arrays.sort(arr2);
        for(var i = 0 ; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println();

        for(var i = 0 ; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
