package lista6;

import java.util.Scanner;

public class SomaEntreValores {
    static void main() {
        int somaTotal = 0;
        int segundoNumero = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor a ser lido");
        int primeiroNumero = scanner.nextInt();
            System.out.println("Digite o segundo valor a ser lido");
            segundoNumero = scanner.nextInt();
            if (segundoNumero < primeiroNumero) {
                for (int i = primeiroNumero; i >= segundoNumero; i--){
                    somaTotal += i;
                }
            } else {
                for (int i = primeiroNumero; i <= segundoNumero; i++){
                    somaTotal += i;
                }
            }
        System.out.println("A soma total entre " + primeiroNumero +" e " + segundoNumero + " é igual a: " + somaTotal);
    }
}
