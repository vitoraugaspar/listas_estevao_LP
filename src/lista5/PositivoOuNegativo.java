package lista5;

import java.util.Scanner;

public class PositivoOuNegativo {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor");
        int valorInserido = scanner.nextInt();
        if (valorInserido < 0){
            System.out.println("O número " + valorInserido + " é negativo");
        } else {
            System.out.println("O número " + valorInserido + " é positivo");
        }
    }
}
