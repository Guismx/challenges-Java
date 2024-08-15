//1.1.13 Pinheiro 1 - Implemente um programa que desenhe um "pinheiro" na tela, similar ao abaixo.
//Enriqueça o desenho com outros caracteres, simulando enfeites.
//              X
//             XXX
//            XXXXX
//           XXXXXXX
//          XXXXXXXXX
//         XXXXXXXXXXX
//        XXXXXXXXXXXXX
//       XXXXXXXXXXXXXXX
//             XX
//             XX
//            XXXX

package easychallenges.simple_exit;

public class challenge1_1_13 {
    public static void main(String[] args) {
        String[] pinheiro = {
                "              J",
                "             XJX",
                "            XXJXX",
                "           XXJXXXX",
                "          XXJXXXXXX",
                "         XXXXXXJXXXX",
                "        XXXJXXXXXJXXX",
                "       XXXXJXXXXXXXXXX",
                "             XX",
                "             XX",
                "            XXXX"
        };
        for (String linha : pinheiro) {
            System.out.println(linha);
        }
    }
}
