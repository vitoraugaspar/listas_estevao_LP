package lista6;

import java.util.Scanner;

public class RangeDezAVinte {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <10; i++) {
            System.out.println("Digite um número para verificar se está no range de 10 a 20");
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <=20){
                System.out.println("O número " + numero +" está no range de 10 a 20");
            } else {
                System.out.println("O número " + numero +" não está no range de 10 a 20");
            }
        }
    }
}
