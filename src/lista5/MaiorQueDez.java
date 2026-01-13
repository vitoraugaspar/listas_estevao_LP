package lista5;

import java.util.Scanner;

public class MaiorQueDez {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número");
        int numeroInserido = scanner.nextInt();
        if (numeroInserido > 10){
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
