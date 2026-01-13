package lista5;

import java.util.Scanner;

public class DoisValoresCrescentes {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro valor");
        int primeiroValor = scanner.nextInt();
        System.out.println("Insira o segundo valor");
        int segundoValor = scanner.nextInt();
        if (primeiroValor < segundoValor){
            System.out.println("Valores em ordem crescente: " + primeiroValor + " e " + segundoValor);
        } else {
            System.out.println("Valores em ordem crescente: " + segundoValor + " e " + primeiroValor);
        }
    }
}


