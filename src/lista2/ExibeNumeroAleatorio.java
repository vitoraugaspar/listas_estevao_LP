package lista2;

import java.util.Random;

public class ExibeNumeroAleatorio {
    static void main() {
        Random numAleatorio = new Random();
        int numAleatorioEntreCem = numAleatorio.nextInt(100);
        System.out.print(numAleatorioEntreCem);
    }
}
