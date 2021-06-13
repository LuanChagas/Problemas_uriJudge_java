
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4 ) / (2 + 3 + 4 + 1);
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("Media: " + df.format(media));
        System.out.println();
        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if(media < 5.0){
            System.out.println("Aluno reprovado.");
        }else {
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();
            System.out.println("Nota do exame: " + notaExame);
            double mediaFinal = (notaExame + media) / 2;
            
            if(mediaFinal >= 5.0){
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + mediaFinal);
        }  
        sc.close();
    }
}
