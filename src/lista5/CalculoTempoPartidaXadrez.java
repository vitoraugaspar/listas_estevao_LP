package lista5;

import java.util.Scanner;

public class CalculoTempoPartidaXadrez {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a hora do inicio do jogo");
        int horaInicial = scanner.nextInt();
        System.out.println("Insira a hora do término do jogo");
        int horaFinal = scanner.nextInt();
        int totalDeHoras = 0;
        if (horaFinal > 24 || horaInicial > 24){
            System.out.println("Valores inválidos. O dia tem apenas 24 horas");
        } else {
            if (horaFinal > horaInicial){
                totalDeHoras = horaFinal - horaInicial;
            } else {
                totalDeHoras = 24 - (horaInicial - horaFinal);
            }
            System.out.println("O jogo durou um total de " + totalDeHoras + " horas");
        }
    }

}
