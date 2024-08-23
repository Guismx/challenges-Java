//1.2.5 Otimização de corte - Um marceneiro, para fazer um trabalho, precisa cortar vários pedaços de
//madeira de 45 cm cada um. Ele pode comprar tábuas de 3, 4 ou 5 metros. Usando os operadores div
//e mod, faça um programa que calcule a quantidade de pedaços e a sobra para cada tipo de tábua,
//permitindo assim uma melhor escolha do marceneiro.

package basics.mathematics;

public class challenge1_2_5 {
    public static void main(String[] args) {
        int pedaco = 45;
        int[] madeira = {300, 400, 500};

        for (int i = 0; i < madeira.length; i++) {
            int novo_tamanho = madeira[i];

            int qtdPedacos = novo_tamanho / pedaco;
            int sobra = novo_tamanho % pedaco;

            System.out.println("Para a tábua de " + (novo_tamanho / 100) + " metros");
            System.out.println("Quantidade de pedaços: " + qtdPedacos);
            System.out.println("Sobra: " + sobra + " cm");
        }
    }
}
