package lista5;

import java.util.Scanner;

public class CalculoCompra {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de Maças compradas");
        int qntMaca = scanner.nextInt();
        double precoTotal = 0F;
        if (qntMaca < 12){
            precoTotal = qntMaca * 1.3;
            System.out.println("O valor da compra de " + qntMaca + " Maças é igual a " + precoTotal);
        } else {
            precoTotal = qntMaca * 1;
            System.out.println("O valor da compra de " + qntMaca + " Maças é igual a " + precoTotal);
        }
    }
}
