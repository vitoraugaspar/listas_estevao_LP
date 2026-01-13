package lista4;

import java.util.Random;

public class ADivisivelPorBRandom {
    static void main() {
        Random numeroUm = new Random();
        Random numeroDois = new Random();
        int numeroUmRandomico = numeroUm.nextInt(1000);
        int numeroDoisRandomico = numeroUm.nextInt(20);
        if (numeroUmRandomico % numeroDoisRandomico == 0){
            System.out.println("Número "+ numeroUmRandomico + " é divisível por " + numeroDoisRandomico);
        } else {
            System.out.println("Número "+ numeroUmRandomico + " não é divisível por " + numeroDoisRandomico);
        }
    }
}
