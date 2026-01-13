package lista5;

import java.util.Scanner;

public class OperacoesComSwitch {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro valor numérico");
        int primeiroValor = scanner.nextInt();
        System.out.println("Insira o segundo valor numérico");
        int segundoValor = scanner.nextInt();
        System.out.println("Insira a operação");
        String operacao = scanner.next();
        switch (operacao){
            case "+":
                System.out.println(primeiroValor + segundoValor);
                break;
            case "-":
                System.out.println(primeiroValor - segundoValor);
                break;
            case "*":
                System.out.println(primeiroValor * segundoValor);
                break;
            case "/":
                System.out.println(primeiroValor / segundoValor);
                break;
        }
    }
}
