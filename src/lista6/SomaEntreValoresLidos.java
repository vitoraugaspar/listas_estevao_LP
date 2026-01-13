package lista6;

import java.util.Scanner;

public class SomaEntreValoresLidos {
    static void main() {
        boolean condicaoExercicio = false;
        int somaTotal = 0;
        int segundoNumero = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor a ser lido");
        int primeiroNumero = scanner.nextInt();
        while (!condicaoExercicio) {
            System.out.println("Digite o segundo valor a ser lido (necessita ser maior que o primeiro)");
            segundoNumero = scanner.nextInt();
            if (segundoNumero > primeiroNumero) {
                condicaoExercicio = true;
            }
        }
            for (int i = primeiroNumero; i <= segundoNumero; i++){
                somaTotal += i;
            }
            System.out.println("A soma total entre " + primeiroNumero +" e " + segundoNumero + " é igual a: " + somaTotal);
        }

}
