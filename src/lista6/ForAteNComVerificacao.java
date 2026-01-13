package lista6;

import java.util.Scanner;

public class ForAteNComVerificacao {
    static void main() {
    Scanner scanner = new Scanner(System.in);
    boolean verificacaoNumero = false;
    int numero = 0;
    while (!verificacaoNumero){
        System.out.println("Insira um número maior que zero");
        numero = scanner.nextInt();
        if (numero > 0){
            verificacaoNumero = true;
        }
    }
    for (int i = 0; i<= numero; i++){
        System.out.print(" " + i);
    }
    }
}
