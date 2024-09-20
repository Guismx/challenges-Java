//1.3.1 Quadrado posicionado - Refaça o programa que desenha o "quadrado" no alto da tela (1.1.6 ),
//desta vez desenhando-o com o canto superior esquerdo na linha 7, coluna 20.

//1.1.6 Quadrado - Escrever um programa que mostre a seguinte figura no alto da tela:
//  XXXXX
//  X   X
//  X   X
//  X   X
//  XXXXX

package basics.screeControll;

public class Challenge1_3_1 {
    public static void main(String[] args) {
        int linhaInicio = 7;
        int colunaInicio = 20;
        int tamanho = 5;

        for (int i = 0; i < linhaInicio; i++) {
            System.out.println();

            for (int linha = 0; linha < tamanho; linha++) {
                for (int col = 0; col < colunaInicio; col++) {
                    System.out.print(" ");
                }

                if (linha == 0 || linha == tamanho - 1) {
                    System.out.println("XXXXX");
                } else {
                    System.out.println("X   X");
                }
            }
        }
    }
}
