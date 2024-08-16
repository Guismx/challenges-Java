//1.2.1 Expressões aritméticas - Calcule as expressões abaixo, observando a precedência dos
//operadores. Escreva um programa que mostre na tela o resultado de cada expressão e confira seus
//cálculos.
// 2*6 + 11*5 =
// 20/(-2)/5 =
// 20/2*2 =
// (3+9)/3*4 =
// (5*6/(3+2) - 15*4)/6-4 =
// 4+32*2 -7*2/(9-2) =

package basics.mathematics;

public class challenge1_2_1 {
    public static void main(String[] args) {
        int calc = (2*6) + (11*5);
        int calc1 = (20/(-2))/5;
        int calc2 = 20/(2*2);
        int calc3 = (3+9)/(3*4);
        int calc4 = ((5*6)/(3+2)) - ((15*4)/6-4);
        int calc5 = (4+32*2)-(7*2)/(9-2);

        System.out.println("o resultado da experessão: (2*6) + (11*5) é igual a = " + calc);
        System.out.println("o resultado da experessão: (20/(-2))/5 é igual a = " + calc1);
        System.out.println("o resultado da experessão: 20/(2*2) é igual a = " + calc2);
        System.out.println("o resultado da experessão: (3+9)/(3*4) é igual a = " + calc3);
        System.out.println("o resultado da experessão: ((5*6)/(3+2)) - ((15*4)/6-4) é igual a = " + calc4);
        System.out.println("o resultado da experessão: (4+32*2)-(7*2)/(9-2 é igual a = " + calc5);

    }
}
