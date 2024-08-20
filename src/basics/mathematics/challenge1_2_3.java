//1.2.3 Conta telefônica - Uma conta telefônica é composta dos seguintes custos:
// assinatura: R$ 17,90
// impulsos: R$ 0,04 por impulso que exceder a 90
// interurbanos
// chamadas p/ celular: R$0,20 por impulso
// Monte a fórmula para calcular o valor da conta para 254 impulsos, R$34,29 de interurbanos
//e 23 chamadas para celular. Elabore um programa que mostra os custos, calcula e mostra o valor
//total.

package basics.mathematics;

public class challenge1_2_3 {
    public static void main(String[] args) {

        float assinatura = 17.90f;
        float impulso = 0.04f;
        float chamadas = 0.20f;

        float resultImp = impulso * 254;
        float resultAss = assinatura / 34.79f;
        float resultCha = chamadas * 23;

        float resultFinal = resultCha + resultAss + resultImp;

        System.out.println("The value about impulse is: R$" + resultImp);
        System.out.println("The value about calls is: R$" + resultCha);
        System.out.println("The value about signature is: R$" + resultAss);
        System.out.printf("The value final is: R$"+ String.format("%.2f", resultFinal));

    }
}
