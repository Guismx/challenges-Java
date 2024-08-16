package basics.simple_exit;

//1.1.6 Quadrado - Escrever um programa que mostre a seguinte figura no alto da tela:
//XXXXX
// X X
// X X
// X X
// XXXXX
public class challenge1_1_6 {
    public static void main(String[] args) {
        int max = 5;
        //CRIANDO A PRIMEIRA LINHA
        for (int i = 0; i < max; i++) {
            System.out.print("X");
        }
        System.out.println("");
        //CRIANDO AS LINHAS COM SEPARAÇÕES
        for (int i = 0; i < max - 3; i++) {
            System.out.print("X");
            for (int j = 0; j < max - 2; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("");
        for (int i = 0; i < max - 3; i++) {
            System.out.print("X");
            for (int j = 0; j < max - 2; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("");
        for (int i = 0; i < max - 3; i++) {
            System.out.print("X");
            for (int j = 0; j < max - 2; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("");
        for (int i = 0; i < max; i++) {
            System.out.print("X");
        }
    }
}
