//1.2.9 Funções matemáticas - Fornecer o valor retornado pelas operações matemáticas abaixo.
//Depois, chamando as funções adequadas, escreva um programa que lhe permita verificar a correção
//dos seus cálculos:
//Raiz quadrada de 169
// 172
// Cosseno(0)
//1.65 arredondado para inteiro

package basics.mathematics;

public class Challenge1_2_9 {
    public static void main(String[] args) {
        // Raiz quadrada de 169
        double raiz = Math.sqrt(169);
        System.out.println("Raiz quadrada de 169: " + raiz);

        // 17² (17 elevado ao quadrado)
        double potencia = Math.pow(17, 2);
        System.out.println("17²: " + potencia);

        // Cosseno de 0
        double cosseno = Math.cos(0);
        System.out.println("Cosseno de 0: " + cosseno);

        // Arredondar 1.65 para o inteiro mais próximo
        long arredondado = Math.round(1.65);
        System.out.println("1.65 arredondado para inteiro: " + arredondado);


    }
}
