import javax.swing.JOptionPane;
import java.util.Scanner;

public class easychallenges {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //SAÍDAS SIMPLES
        //1.1.1 - Frase na tela - Implemente um programa que escreve na tela a frase "O primeiro programa a
        //gente nunca esquece!".
        System.out.println("O primeiro programa a gente nunca esquece!");

        //1.1.2 Etiqueta - Elabore um programa que, após limpar a tela, escreve seu nome completo na
        //primeira linha, seu endereço na segunda, e o CEP e telefone na terceira.
        String nome = "Guilherme Rodrigues de Almeida";
        String endereco = "Q. 204, Conj XX, Brasília";
        int cep = 718740 - 30;
        int numero = 993333333;

        System.out.println("Meu nome é: " + nome + '\n' + "Endereço: " + endereco + '\n' + "CEP:" + cep + '\n' + "Telefone: " + numero);

        //1.1.3 Frases assassinas - Faça um programa que mostre na tela algumas frases assassinas, que são
        //aquelas que fazem com muitas idéias sejam perdidas antes que amadureçam ou seja aprofundadas.
        //Eis alguns exemplos (bole também os seus):
        String[] fassassins = new String[5];
        fassassins[0] = "Isto não vai da certo";
        fassassins[1] = "Você nunca vai conseguir";
        fassassins[2] = "Você vai se estrepar";
        fassassins[3] = "Não vai dar em nada";
        fassassins[4] = "Está tudo errado!";

        for (String fassassin : fassassins) {
            System.out.println(fassassin);

        }

        //1.1.5 Ao mestre - Escreva um bilhete ao seu professor, informando seus objetivos nesta disciplina e o
        //que espera dela e do professor. Implemente um programa que mostra seu bilhete na tela.
        System.out.println("Olá Mr. meu objetivo nesta disciplina é agregar e consolidar meus conhecimentos, espero que o sr. " +
                "ajude-me com seus conhecimntos.");

        //1.1.6 Quadrado - Escrever um programa que mostre a seguinte figura no alto da tela:
        //XXXXX
        // X X
        // X X
        // X X
        // XXXXX
    }
}

