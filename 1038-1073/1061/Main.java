import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaI = Integer.parseInt(sc.nextLine().replaceAll("[^0-9]", ""));
        String[] tempoA = sc.nextLine().split(" : ");
        List<Integer> tempoI = Arrays.asList(tempoA).stream().map(x -> Integer.parseInt(x))
                .collect(Collectors.toList());
        int diaF = Integer.parseInt(sc.nextLine().replaceAll("[^0-9]", ""));
        tempoA = sc.nextLine().split(" : ");
        List<Integer> tempoF = Arrays.asList(tempoA).stream().map(x -> Integer.parseInt(x))
                .collect(Collectors.toList());

        int hora;
        int dia = diaF - diaI;
        if (tempoI.get(0) > tempoF.get(0) || (tempoI.get(0) == tempoF.get(0) && tempoI.get(0) != 0)) {
            hora = 24 - tempoI.get(0) + tempoF.get(0);
        } else {
            hora = tempoF.get(0) - tempoI.get(0);
        }
        int minutos = tempoI.get(1) >= tempoF.get(1) ? 60 - tempoI.get(1) + tempoF.get(1)
                : tempoF.get(1) - tempoI.get(1);
        int segundos = tempoI.get(2) > tempoF.get(2) ? 60 - tempoI.get(2) + tempoF.get(2)
                : tempoF.get(2) - tempoI.get(2);
        dia = tempoI.get(0) > tempoF.get(0) || (tempoI.get(0) == tempoF.get(0) && tempoI.get(1) > tempoF.get(1))
                ? dia - 1
                : dia;
        dia = dia < 0 ? 0 : dia;
        hora = tempoI.get(1) >= tempoF.get(1) && tempoI.get(2) > tempoF.get(2) ? hora - 1 : hora;
        hora = hora == 24 ? 0 : hora;
        minutos = tempoI.get(2) > tempoF.get(2) && tempoI.get(1) >= tempoF.get(1) ? minutos - 1 : minutos;
        minutos = minutos == 60 ? 0 : minutos;

        System.out.println(dia + " dia(s)");
        System.out.println(hora + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
