//1.2.14 Devagar se vai ao longe - Vou e volto diariamente a pé para o trabalho, que dista
//aproximadamente 800 m de minha casa. Supondo que trabalho 5 dias por semana, 45 semanas por
//ano, "bole" a operação matemática que deve ser efetuada para calcular quantos quilômetros,
//aproximadamente, terei andado ao final de um ano. Elabore um programa que faça as contas e
//mostre o resultado na tela.


package basics.mathematics;

import java.util.Scanner;

public class Challenge1_2_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distanciaTrabalho;
        int diasPorSemana;
        int quantidadeSemanas;
        int calculo;
        int resultado;


        System.out.println("Informe a distância do seu trabalho: ");
        distanciaTrabalho = scan.nextInt();

        System.out.println("Informe quantos dias por semana você trabalha: ");
        diasPorSemana = scan.nextInt();

        System.out.println("Informe quantas semanas você trabalhou: ");
        quantidadeSemanas = scan.nextInt();

        calculo = (int) ((distanciaTrabalho * diasPorSemana) * quantidadeSemanas);
        resultado = calculo / 1000;

        System.out.println("De acordo com os dados informados você percorreu: " + resultado + "km, somente indo");
        System.out.println("De acordo com os dados informados você percorreu: " + (resultado * 2 )+ "km, somando ida e volta");
    }
}
