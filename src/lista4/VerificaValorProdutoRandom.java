package lista4;

import java.util.Random;

public class VerificaValorProdutoRandom {
    static void main() {
        Random primeiroPreco = new Random();
        Random segundoPreco = new Random();
        int precoProdutoUm = primeiroPreco.nextInt(1001);
        int precoProdutoDois = primeiroPreco.nextInt(1001);
        if (precoProdutoUm > precoProdutoDois){
            System.out.println("O valor do produto um é maior que o valor do produto dois");
        } else if (precoProdutoDois > precoProdutoUm) {
            System.out.println("O valor do produto dois é maior que o valor do produto um");
        } else {
            System.out.println("Preços iguais");
        }
    }
}
