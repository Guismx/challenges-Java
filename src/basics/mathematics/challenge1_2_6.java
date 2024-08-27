//1.2.6 Média de notas - Monte uma expressão matemática que calcula a média de suas notas (todas)
//de um período anterior. Faça o cálculo através de um programa, mostrando na tela o resultado,
//formatado com duas casas decimais e dentro de uma moldura (um retângulo feito com algum
//caractere).


package basics.mathematics;

public class challenge1_2_6 {
    public static void main(String[] args) {
        float[] notas = {7.0f, 9.2f, 6.8f, 8.4f, 8.3f};
        float soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        float media = soma / notas.length;
        System.out.println("===============\n" + "||" + "   MÉDIA" + "   ||\n" + "===============\n" +   "||" + "        " + "   ||\n" +
                "||   " + String.format("%.2f", media)  + "    ||\n" +   "||" + "        " + "   ||\n" + "===============");
    }
}
