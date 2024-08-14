//1.1.8 Apresentação - Um estudante ia participar de uma feira de ciências e seu projeto tinha o tema
//"fotossíntese". Ele conseguiu um notebook emprestado, e queria um programa que lhe permitisse
//apresentar um texto dividido em partes, cada parte em uma tela, e o programa deveria mudar para a
//próxima tela ao toque de uma tecla. A tela inicial deve ser a palavra "FOTOSSÍNTESE" escrita
//com letras grandes. Faça o programa para o estudante, usando o texto abaixo, no qual cada
//parágrafo deve aparecer em uma tela diferente. Como o estudante não entende muito de operação
//de computadores, você tem que também gerar um arquivo executável, copiá-lo para o outro
//computador e incluir um ícone para fácil execução sob Windows.
// Texto:
// "A água e os sais minerais absorvidos pelas raízes sobem através dos vasos lenhosos do
//caule e chegam às folhas.
// Nas folhas, existe uma substância verde, a clorofila, que absorve a energia luminosa do sol.
//Ao mesmo tempo, por meio dos estômatos presentes nas folhas, a planta absorve gás carbônico do
//ar.
// Usando a energia solar, o gás carbônico e o hidrogênio contido na água retirada do solo,
//após complicadas reações químicas, a planta produz açúcares (glicose)."

package easychallenges;

import java.util.Scanner;

public class challenge1_1_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] texto = new String[3];
        texto[0] = "A água e os sais minerais absorvidos pelas raízes sobem através dos vasos lenhosos do" + "caule e chegam às folhas.";
        texto[1] = "Nas folhas, existe uma substância verde, a clorofila, que absorve a energia luminosa do sol." + "Ao mesmo tempo, por meio dos estômatos presentes nas folhas, a planta absorve gás carbônico do" + "ar. ";
        texto[2] = "Usando a energia solar, o gás carbônico e o hidrogênio contido na água retirada do solo," + "após complicadas reações químicas, a planta produz açúcares (glicose).";

        System.out.println(texto[0]);
        System.out.println("Próxima? s/n");
        if (teclado.next().trim().toLowerCase().equals("s")) {
            System.out.println(texto[1]);
            System.out.println("Próxima? s/n");
            if (teclado.next().trim().toLowerCase().equals("s")) {
                System.out.println(texto[2]);
            }
        } else {
            System.out.println("Programa encerrado !");
        }
    }
}

