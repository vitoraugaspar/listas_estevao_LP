package lista4;

import java.util.Scanner;

public class ADivisivelPorB {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro valor (entre 0 e 1000)");
        int valorUm = scanner.nextInt();
        System.out.println("Insira o segundo valor (entre 0 e 20)");
        int valorDois = scanner.nextInt();
        if (valorUm > 1000 || valorDois > 20){
            System.out.println("Algum número digitado é invalido");
        } else {
            if (valorUm < valorDois){
                System.out.println("Número dois maior que o número um. Impossível de resolver");
            } else {
                if (valorUm % valorDois == 0){
                    System.out.println("Número "+ valorUm + " é divisível por " + valorDois);
                } else {
                    System.out.println("Número "+ valorUm + " não é divisível por " + valorDois);
                }
            }
        }
    }

}
