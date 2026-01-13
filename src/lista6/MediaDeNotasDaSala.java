package lista6;

import java.util.Scanner;

public class MediaDeNotasDaSala {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos");
        int qntAlunos = scanner.nextInt();
        int[] notas = new int[qntAlunos];
        int media = 0;
        for (int i = 0; i < qntAlunos; i++){
            System.out.println("Digite a nota do aluno de número "+ (1 + i));
            notas[i] = scanner.nextInt();
        }
        for (int i = 0; i < qntAlunos; i++){
            media += notas[i];
        }
        System.out.println("A média da turma com " + qntAlunos + " alunos é de: " + media/qntAlunos);
    }
}
