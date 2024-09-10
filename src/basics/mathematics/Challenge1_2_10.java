//1.2.10 Comprimento de fio - Um eletricista precisa comprar fio
//que irá passar, pelo telhado, por toda a diagonal de uma casa de
//formato retangular. Como ele não tem condições de medir a
//diagonal com precisão (ou talvez não queira...), a solução
//alternativa que ele encontrou foi medir os lados da casa, sabendo
//que a diagonal pode ser calculada com base nos lados pelo
//Teorema de Pitágoras (a2
// = b2
// + c2
//). Considerando que a casa mede 11,5 x 6,3 metros, faça um
//programa que calcule a quantidade mínima necessária de fio a ser comprada, com precisão até
//centímetros

package basics.mathematics;

public class Challenge1_2_10 {
    public static void main(String[] args) {
        //Medidas da casa em metros
        double ladoA = 11.5;
        double ladoB = 6.3;

        //Cálculo da diagonal usando o Teorema de Pitágoras
        double diagonal = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));

        //Converter a diagonal de metros para centímetros
        double diagonalCm = diagonal * 100;

        //Exibir o resultado com precisão até os centímetros
        System.out.printf("A quantidade mínima de fio necessária é %.2f cm.\n", diagonalCm);
    }
}
