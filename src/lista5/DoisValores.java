package lista5;

import java.util.Scanner;

public class DoisValores {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro valor");
        int primeiroValor = scanner.nextInt();
        System.out.println("Insira o segundo valor");
        int segundoValor = scanner.nextInt();
        if (primeiroValor > segundoValor){
            System.out.println("O maior valor é: " + primeiroValor);
        } else {
            System.out.println("O maior valor é: " + segundoValor);
        }
    }
}
