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
//1.1.14 Pinheiro 2 -Elabore uma versão 2 do programa do item anterior que desenhe o pinheiro com
//asteriscos (*). [Dica: use o recurso de localização/substituição do editor para fazer a substituição
//rapidamente]

package easychallenges.simple_exit;

public class challenge1_1_14 {
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
            String alterando = linha.replace("X", "*").replace("J", "*");
            System.out.println(alterando);
        }
    }
}
