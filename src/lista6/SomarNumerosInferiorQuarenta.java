package lista6;

import java.util.Scanner;

public class SomarNumerosInferiorQuarenta {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números. Se eles forem menores que 40, serão atribuídos a soma total");
        int somaTotal = 0;
        for (int i = 0; i<10; i++){
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado <= 40){
                somaTotal += numeroDigitado;
            }
        }
        System.out.println("O total da soma de números menores que 40 digitados é igual a: " + somaTotal);
    }
}
