package lista6;

import java.util.Scanner;

public class DefinirMaiorNumeroInserido {
    static void main() {
        int maiorNumeroDigitado = 0;
        int qntDeNumerosSendoDigitados = 10;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<= qntDeNumerosSendoDigitados; i++){
            System.out.println("Insira um número");
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado > maiorNumeroDigitado){
                maiorNumeroDigitado = numeroDigitado;
            }
        }
        System.out.println("Depois de " + qntDeNumerosSendoDigitados + " números digitados, o maior número que apareceu foi: " +maiorNumeroDigitado);
    }
}
