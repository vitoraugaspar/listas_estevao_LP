package lista6;

import java.util.Scanner;

public class CalcularMedia {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] vetorNumeros = new int[10];
        int media = 0;
        for (int i = 0; i <10; i++) {
            System.out.println("Digite um número");
           vetorNumeros[i] = scanner.nextInt();
        }
        for (int i = 0; i <10; i++) {
            media += vetorNumeros[i];
        }
        System.out.println("A media aritmética de todos os valores digitados é igual a: " + media/10);
    }
}
