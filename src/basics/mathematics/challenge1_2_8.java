//1.2.8 Imposto - Um imposto é calculado com base na seguinte tabela:
//Até 1.200,00 isento
//de 1.201,00 a 5.000,00 10%
//de 5.001,00 a 10.000,00 15%
//acima de 10.000,00 20%.
//Implemente um programa que calcule os impostos a pagar para um valor em cada faixa. Para
//cada um, mostre uma mensagem que identifique na tela a que se refere cada valor.


package basics.mathematics;

import java.util.Scanner;

public class challenge1_2_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double imposto;

        System.out.println("Digite o valor para calcular seu imposto: ");
        imposto = scan.nextInt();
        if (imposto <= 1.200) {
            System.out.println("Você está insento de impostos !");
        } else if (imposto < 5.000) {
            double porcentagem = imposto * 0.10;
            double resultado = porcentagem + imposto;
            System.out.println("Seu valor de imposto é: R$"+ String.format("%.2f", imposto) + " Com a taxa de 10%, fica: R$" + String.format("%.2f", resultado));
        } else if (imposto < 10.000) {
            double porcentagem = imposto * 0.15;
            double resultado = porcentagem + imposto;
            System.out.println("Seu valor de imposto é: R$"+ String.format("%.2f", imposto) + " Com a taxa de 15%, fica: R$" + String.format("%.2f", resultado));
        } else {
            double porcentagem = imposto * 0.20;
            double resultado = porcentagem + imposto;
            System.out.println("Seu valor de imposto é: R$"+ String.format("%.2f", imposto) + " Com a taxa de 20%, fica: R$" + String.format("%.2f", resultado));
        }
    }
}
