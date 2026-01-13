package lista6;

import java.util.Scanner;

public class LerDezNumeros {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número para verificar se é positivo ou negativo");
            int numero = scanner.nextInt();
            if (numero >= 0){
                System.out.println("O número " + numero +" é positivo");
            } else {
                System.out.println("O número " + numero +" é negativo");
            }
        }
    }
}
