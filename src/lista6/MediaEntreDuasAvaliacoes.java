package lista6;

import java.util.Scanner;

public class MediaEntreDuasAvaliacoes {
    static void main() {
        boolean repeticaoCondicao = true;
        while (repeticaoCondicao){
            boolean primeiraCondicao = false;
            int primeiraNota = 0;
            int segundaNota = 0;
            int media = 0;
            Scanner scanner = new Scanner(System.in);
            while (!primeiraCondicao){
                System.out.println("Digite a primeira nota (necessita ser entre 0 e 10)");
                primeiraNota = scanner.nextInt();
                System.out.println("Digite a segunda nota (necessita ser entre 0 e 10)");
                segundaNota = scanner.nextInt();
                if (primeiraNota >= 0 && primeiraNota <=10 && segundaNota >=0 && segundaNota <=10){
                    primeiraCondicao = true;
                }

            }
            media = (primeiraNota + segundaNota) / 2;
            System.out.println("A média das duas notas é igual a:" + media);
            System.out.println("\n Deseja realizar o cálculo novamente? (S/N)");
            String respostaRepeticao = scanner.next();
            if (respostaRepeticao.equals("N")){
                repeticaoCondicao = false;
            }
        }
    }
}
