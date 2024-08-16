//2.1.3 Losangos 1 - Implemente um programa que desenhe os losangos abaixo na tela, sendo que o
//topo do primeiro losango é colocado em uma linha e uma coluna lidas do teclado, e o topo do
//segundo fica 15 colunas à direita do primeiro.
//                   X                          X
//                  XXX                        XXX
//                 XXXXX                      XXXXX
//                XXXXXXX                    XXXXXXX
//               XXXXXXXXX                  XXXXXXXXX
//                XXXXXXX                    XXXXXXX
//                 XXXXX                      XXXXX
//                  XXX                        XXX
//                   X                          X

package variable_and_data_entry.mathematics;

import java.util.Scanner;

public class challenge1_2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 5;

        System.out.println("Write a caracter: ");
        String input = scan.nextLine();

        for (int i = 0; i < max; i++) {
            System.out.println(" ");
        }
        System.out.println("X");
    }
}
