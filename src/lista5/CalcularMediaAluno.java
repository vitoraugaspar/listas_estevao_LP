package lista5;

import java.util.Scanner;

public class CalcularMediaAluno {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a primeira notal do aluno");
        int primeiraNota = scanner.nextInt();
        System.out.println("Insira a segunda notal do aluno");
        int segundaNota = scanner.nextInt();
        float media = 0F;
        if (primeiraNota < 0 || segundaNota < 0){
            System.out.println("Notas precisam ser maior ou igual a 0");
        } else {
            media = (float)(primeiraNota + segundaNota) / 2;
            if (media < 6){
                System.out.println("O aluno obteve as notas " + primeiraNota + " e " + segundaNota + " e foi REPROVADO com média igual a " + media);
            } else {
                System.out.println("O aluno obteve as notas " + primeiraNota + " e " + segundaNota + " e foi APROVADO com média igual a " + media);
            }
        }
    }

}
