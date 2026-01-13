package lista6;

import java.util.Scanner;

public class TabuadaQualquer {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 10");
        int numeroAlvo = scanner.nextInt();
        int tabuada = 0;
        if (numeroAlvo > 10){
            System.out.println("O número digitado é invalido");
        } else {
            for (int i = 1; i <= 10; i++){
                tabuada = numeroAlvo * i;
                System.out.print(" " + tabuada);
            }
        }
    }
}
