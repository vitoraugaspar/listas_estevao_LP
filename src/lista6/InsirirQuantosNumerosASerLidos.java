package lista6;

import java.util.Scanner;

public class InsirirQuantosNumerosASerLidos {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int maiorNumeroDigitado = 0;
        System.out.println("Digite a quantidade de números a serem lidos");
        int qntdNumeros = scanner.nextInt();
        for (int i = 0; i < qntdNumeros; i++){
            System.out.println("Digite um número");
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado > maiorNumeroDigitado){
                maiorNumeroDigitado = numeroDigitado;
            }
        }
        System.out.println("Depois de " + qntdNumeros + " digitados, o maior número que apareceu foi: " + maiorNumeroDigitado);
    }
}
