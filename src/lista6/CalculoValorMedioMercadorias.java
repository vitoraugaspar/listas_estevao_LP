package lista6;

import java.util.Scanner;

public class CalculoValorMedioMercadorias {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int precoTotalEmMercadoria = 0;
        System.out.println("Digite a quantidade de mercadoria no estoque");
        int qntMercadoria = scanner.nextInt();
        System.out.println("Digite o preco de cada mercadoria no estoque");
        int precoMercadoria = scanner.nextInt();
        precoTotalEmMercadoria = (qntMercadoria * precoMercadoria);
        System.out.println("O estoque conta com " + qntMercadoria + " produtos. Cada produto tem um valor de " + precoMercadoria + ". O valor total em mercadoria é igual a: " + precoTotalEmMercadoria);

    }
}
