package lista6;

import java.util.Scanner;

public class CalculoEntreQuinzeProdutos {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        float maiorPrecoLido = 0;
        float somaValorProdutos = 0;
        for (int i = 0; i< 15; i++){
            System.out.println("Digite o preço do produto");
            float precoProduto = scanner.nextFloat();
            somaValorProdutos += precoProduto;
            if (precoProduto > maiorPrecoLido) {
                maiorPrecoLido = precoProduto;
            }
        }
        System.out.println("Depois de 15 produtos lidos, a média de preço foi de " + (somaValorProdutos/15) + " e o maior valor digitado foi de " + maiorPrecoLido);
    }
}
