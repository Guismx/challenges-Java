//1.1.9 Letra grande - Elabore um programa para produzir na tela a letra X usando a própria. Se fosse
//‘L’, seria assim:
// L
// L
// L
// L L L L

package easychallenges;

public class challenge1_1_9 {
    public static void main(String[] args) {
        int max = 5;

        for (int i = 0; i < max -3; i++) {
            System.out.print("X");
            for (int j = 0; j < max -2; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("");
        for (int i = 2; i < max -2; i++) {
            System.out.print(" " + "X X\n");
        }
        for (int i = 1; i < max -3; i++) {
            System.out.println("  X");
        }
        for (int i = 2; i < max -2; i++) {
            System.out.print(" " + "X X\n");
        }
        for (int i = 0; i < max -3; i++) {
            System.out.print("X");
            for (int j = 0; j < max -2; j++) {
                System.out.print(" ");
            }
        }
    }
}
