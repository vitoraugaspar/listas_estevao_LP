package lista5;

import java.util.Scanner;

public class Vendas {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário");
        double valorSalario = scanner.nextDouble();
        System.out.println("Digite o valor total em vendas");
        double valorEmVendas = scanner.nextDouble();
        double valorComissao = 0.00;
        double salarioTotalComComissao = 0.00;
        if (valorEmVendas < 1500){
            valorComissao = valorEmVendas * 1.03;
        } else {
            valorComissao = valorEmVendas * 1.05;
        }
        salarioTotalComComissao = valorSalario + valorComissao;
        System.out.println("Salário total com comissão é igual a: " + salarioTotalComComissao);
    }
}
