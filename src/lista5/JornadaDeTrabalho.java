package lista5;

import java.util.Scanner;

public class JornadaDeTrabalho {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira quantas horas foram trabalhadas na semana");
        int horasTrabalhadas = scanner.nextInt();
        System.out.println("Insira o valor ganho por hora trabalhada");
        int valorPorHoraTrabalhada = scanner.nextInt();
        int jornadaSemanalNormal = 40;
        int horasExtras = 0;
        double totalSalario = 0.00;
        if (horasTrabalhadas > jornadaSemanalNormal){
            horasExtras = horasTrabalhadas - jornadaSemanalNormal;
        }
        totalSalario = (jornadaSemanalNormal * valorPorHoraTrabalhada) + (horasExtras * 1.5);

    }

}
