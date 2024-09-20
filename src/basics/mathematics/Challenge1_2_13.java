//1.2.13 Funções aninhadas - Escrever um programa que calcula a raiz de 3, arredonda o resultado e
//calcula a exponencial do valor resultante.

package basics.mathematics;

public class Challenge1_2_13 {
    public static void main(String[] args) {
        double raizQuadrada = Math.sqrt(3);

        long valorArredondado = Math.round(raizQuadrada);

        double resultado = Math.exp(valorArredondado);

        System.out.println("O valor é: " + String.format("%.2f", resultado));
    }
}
