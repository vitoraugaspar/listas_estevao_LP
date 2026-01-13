package lista6;

public class MediaAritmeticaEntreQuinzeECem {
    static void main() {
        int totalDeNumeros = 0;
        int soma = 0;
        int mediaAritmetica = 0;
        for (int i = 15; i<=100; i++){
            totalDeNumeros++;
            soma += i;
        }
        mediaAritmetica = soma/totalDeNumeros;
        System.out.println("O total da media aritmética entre 15 e 100 é igual a: " + mediaAritmetica);
    }
}
