//1.2.11 Tempo dedicado - Uma pessoa com pouco tempo disponível lê um livro por 5 minutos a cada
//dia, 6 dias por semana. Monte a fórmula e escreva um programa que calcula e mostra na tela quanto
//tempo, em horas, a pessoa terá dedicado ao livro ao final de um ano.

package basics.mathematics;

public class Challenge1_2_11 {
    public static void main(String[] args) {
        int tempoDiario = 5;
        int diasDaSemana = 6;
        double semanasNoAno = (double) 365 / 7;

        int tempoSemanal = tempoDiario * diasDaSemana;
        double tempoAno = tempoSemanal * semanasNoAno;

        double tempoEmHoras = tempoAno / 60.0;

        System.out.printf("O tempo dedicado durante 1 ano será de: %.2f horas.\n", tempoEmHoras);

    }
}
