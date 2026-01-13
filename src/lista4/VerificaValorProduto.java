package lista4;

import java.util.Scanner;

public class VerificaValorProduto {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do produto um");
        int precoProdutoUm = scanner.nextInt();
        System.out.println("Insira o valor do produto dois");
        int precoProdutoDois = scanner.nextInt();
        if (precoProdutoUm > 1000 || precoProdutoDois > 1000){
            System.out.println("Valor Inválido");
        } else {
            if (precoProdutoUm > precoProdutoDois){
                System.out.println("O valor do produto um é maior que o valor do produto dois");
            } else if (precoProdutoDois > precoProdutoUm) {
                System.out.println("O valor do produto dois é maior que o valor do produto um");
            } else {
                System.out.println("Preços iguais");
            }
        }
    }
}
