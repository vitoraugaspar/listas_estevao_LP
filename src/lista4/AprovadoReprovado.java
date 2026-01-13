package lista4;

import java.util.Scanner;

public class AprovadoReprovado {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a nota do aluno (entre 0 e 10)");
        int notaInserida = scanner.nextInt();
        if(notaInserida > 10 || notaInserida < 0){
            System.out.println("Valor Invalido");
        } else {
            if (notaInserida < 6){
                System.out.println("Reprovado");
            } else {
                System.out.print("Aprovado");
            }
        }
    }
}
