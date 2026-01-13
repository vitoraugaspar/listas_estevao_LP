package lista6;

import java.util.Scanner;

public class ForAteN {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número");
        int numero = scanner.nextInt();
        for (int i = 0; i <= numero; i++){
            System.out.print(" " + i);
        }
    }
}
