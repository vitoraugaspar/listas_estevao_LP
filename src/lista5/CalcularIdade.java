package lista5;

import java.time.LocalDate;
import java.util.Scanner;

public class CalcularIdade {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o ano de nascimento");
        int anoDeNascimento = scanner.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idadeAtual = anoAtual - anoDeNascimento;
        if (idadeAtual > 18){
            System.out.println("Apto a votar");
        } else {
            System.out.println("Inapto a votar");
        }
    }

}
