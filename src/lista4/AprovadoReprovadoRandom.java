package lista4;

import java.util.Random;

public class AprovadoReprovadoRandom {
    static void main() {
        Random nota = new Random();
        int notaEntreZeroDez = nota.nextInt(11);
        if (notaEntreZeroDez < 6){
            System.out.println("Reprovado");
        } else {
            System.out.print("Aprovado");
        }
    }
}
