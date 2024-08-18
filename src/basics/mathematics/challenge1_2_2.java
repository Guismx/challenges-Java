//1.2.2 Div e mod - Calcule as expressões abaixo; o operador mod calcula o resto, e div, o quociente da
//divisão inteira. Depois, escreva um programa que lhe permita verificar, quando executado, se você
//calculou corretamente.
// 37 mod 13 =
// 41 div 7 =
// 11 div 3 mod 2 =
// 11 mod 3 div 2 =

package basics.mathematics;

public class challenge1_2_2 {
    public static void main(String[] args) {
      //MOD - resto da divisão
      //DIV - Quociente

        int calc1 = 37 % 13;
        int calc2 = 41 / 7;
        int calc3 = (11 / 3) % 2;
        int calc4 = (11 % 3) / 2;

        int expected = 11;
        int expected1 = 5;
        int expected2 = 1;
        int expected3 = 1;

        if (calc1 == expected && calc2 == expected1 && calc3 == expected2 && calc4 == expected3) {
            System.out.println("37 mod 13 = " + calc1);
            System.out.println("41 div 7 = " + calc2);
            System.out.println("11 div 3 mod 2 = " + calc3);
            System.out.println("11 mod 3 div 2 = " + calc4);

        } else {
            System.out.println("has incorrect calculations");
        }
    }
}
