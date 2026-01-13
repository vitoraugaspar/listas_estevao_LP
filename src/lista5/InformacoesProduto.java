package lista5;

import java.util.Scanner;

public class InformacoesProduto {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do produto");
        double valorProduto = scanner.nextDouble();
        double valorFreteEmPorcentagem = 0.00;
        double valorFrete = 0.00;
        double valorProdutoComFrete = 0.00;
        System.out.println("Insira o código do produto (0 até 20)");
        int codigoProduto = scanner.nextInt();
            if (codigoProduto == 1){
                valorFreteEmPorcentagem = 0.10;
                valorFrete = valorFreteEmPorcentagem * valorProduto;
                valorProdutoComFrete = valorProduto + valorFrete;
                System.out.println(" Preço do produto: " + valorProduto + "\n Procedência: Norte \n Valor do frete: " + valorFrete + "\n Valor do produto com frete incluso: " + valorProdutoComFrete);
            } else if (codigoProduto == 2 || codigoProduto == 5 || codigoProduto == 9) {
                valorFreteEmPorcentagem = 0.03;
                valorFrete = valorFreteEmPorcentagem * valorProduto;
                valorProdutoComFrete = valorProduto + valorFrete;
                System.out.println(" Preço do produto: " + valorProduto + "\n Procedência: Sul \n Valor do frete: " + valorFrete + "\n Valor do produto com frete incluso: " + valorProdutoComFrete);
            } else if (codigoProduto == 3 || codigoProduto >= 10 && codigoProduto <= 15) {
                valorFreteEmPorcentagem = 0.012;
                valorFrete = valorFreteEmPorcentagem * valorProduto;
                valorProdutoComFrete = valorProduto + valorFrete;
                System.out.println(" Preço do produto: " + valorProduto + "\n Procedência: Leste \n Valor do frete: " + valorFrete + "\n Valor do produto com frete incluso: " + valorProdutoComFrete);
            } else if (codigoProduto == 7 || codigoProduto == 20) {
                valorFreteEmPorcentagem = 0.073;
                valorFrete = valorFreteEmPorcentagem * valorProduto;
                valorProdutoComFrete = valorProduto + valorFrete;
                System.out.println(" Preço do produto: " + valorProduto + "\n Procedência: Oeste \n Valor do frete: " + valorFrete + "\n Valor do produto com frete incluso: " + valorProdutoComFrete);
            } else {
                valorFreteEmPorcentagem = 0.222;
                valorFrete = valorFreteEmPorcentagem * valorProduto;
                valorProdutoComFrete = valorProduto + valorFrete;
                System.out.println(" Preço do produto: " + valorProduto + "\n Procedência: Importado \n Valor do frete: " + valorFrete + "\n Valor do produto com frete incluso: " + valorProdutoComFrete);
            }
        }
}
