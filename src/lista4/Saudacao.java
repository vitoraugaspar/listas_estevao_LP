package lista4;

import java.util.Scanner;

public class Saudacao {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a hora");
        int hora = scanner.nextInt();
        if (hora >= 24){
            System.out.println("A hora inseridade tem que estar entre 0 e 24");
        } else {
            if (hora <= 6){
                System.out.println("Zzzzz");
            } else if (hora <=11) {
                System.out.println("Bom dia!");
            } else if (hora <=17) {
                System.out.println("Boa tarde!");
            } else {
                System.out.println("Boa noite!");
            }
        }
    }
}
