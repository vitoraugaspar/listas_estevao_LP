package lista6;

import java.util.Scanner;

public class SomaDezNumeros {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int valorDigitado = 0;
        for (int i = 0; i<10; i++){
            System.out.println("Digite um valor");
            valorDigitado = scanner.nextInt();
            soma += valorDigitado;
        }
        System.out.println("A soma dos 10 valores é igual a:" + soma);
    }

}
