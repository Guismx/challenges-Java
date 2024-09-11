//1.2.12 Cálculo de notas - Um professor atribui pesos de 1 a 4 para as notas de quatro avaliações. A
//nota é calculada por meio da média ponderada (N1 + N2*2 + N3*3 + N4*4)/10, onde N1 é a nota
//da primeira avaliação, N2 a da segunda, etc..Um aluno tirou as seguintes notas: 8 - 7,5 - 10 - 9.
//Faça um programa que calcula e mostra as notas e a média deste aluno, sendo a média formatada
//com 1 casa decimal.

package basics.mathematics;

public class Challenge1_2_12 {
    public static void main(String[] args) {
        double nota1 = 8;
        double nota2 = 7.5 * 2;
        double nota3 = 10 * 3;
        double nota4 = 9 * 4;

        double media = (nota1 + nota2 + nota3 + nota4) / 10;

        System.out.printf("Notas do aluno:\nN1 = %.1f\nN2 = %.1f\nN3 = %.1f\nN4 = %.1f\n", nota1, nota2, nota3, nota4);
        System.out.printf("Média ponderada = %.1f\n", media);
    }
}
