//1.2.7 Conversão de temperatura - Faça um programa que calcula e mostra uma tabela de graus
//Celsius/Fahrenheit de 1 a 10 [fórmula: C = 5/9(F-32)]. Por enquanto (sem comandos de repetição),
//você deverá escrever as instruções para calcular e mostrar cada resultado.

package basics.mathematics;

public class challenge1_2_7 {
    public static void main(String[] args) {
        //Fórmula double celsius = (5.0 / 9.0) * (fahrenheit1 - 32);

        double fahrenheit1 = 1;
        double celsius = (5.0 / 9.0) * (fahrenheit1 - 32);
        System.out.println("Fahrenheit = " + fahrenheit1 + " => Celsius: " + String.format("%.2f", celsius));

        double fahrenheit2 = 2;
        double celsius2 = (5.0 / 9.0) * (fahrenheit2 - 32);
        System.out.println("Fahrenheit = " + fahrenheit2 + " => Celsius: " + String.format("%.2f", celsius2));

        double fahrenheit3 = 3;
        double celsius3 = (5.0 / 9.0) * (fahrenheit3 - 32);
        System.out.println("Fahrenheit = " + fahrenheit3 + " => Celsius: " + String.format("%.2f", celsius3));

        double fahrenheit4 = 4;
        double celsius4 = (5.0 / 9.0) * (fahrenheit4 - 32);
        System.out.println("Fahrenheit = " + fahrenheit4 + " => Celsius: " + String.format("%.2f", celsius4));

        double fahrenheit5 = 5;
        double celsius5 = (5.0 / 9.0) * (fahrenheit5 - 32);
        System.out.println("Fahrenheit = " + fahrenheit5 + " => Celsius: " + String.format("%.2f", celsius5));

        double fahrenheit6 = 6;
        double celsius6 = (5.0 / 9.0) * (fahrenheit6 - 32);
        System.out.println("Fahrenheit = " + fahrenheit6 + " => Celsius: " + String.format("%.2f", celsius6));

        double fahrenheit7 = 7;
        double celsius7 = (5.0 / 9.0) * (fahrenheit7 - 32);
        System.out.println("Fahrenheit = " + fahrenheit7 + " => Celsius: " + String.format("%.2f", celsius7));

        double fahrenheit8 = 8;
        double celsius8 = (5.0 / 9.0) * (fahrenheit8 - 32);
        System.out.println("Fahrenheit = " + fahrenheit8 + " => Celsius: " + String.format("%.2f", celsius8));

        double fahrenheit9 = 9;
        double celsius9 = (5.0 / 9.0) * (fahrenheit9 - 32);
        System.out.println("Fahrenheit = " + fahrenheit9 + " => Celsius: " + String.format("%.2f", celsius9));

        double fahrenheit10 = 10;
        double celsius10 = (5.0 / 9.0) * (fahrenheit10 - 32);
        System.out.println("Fahrenheit = " + fahrenheit10 + " => Celsius: " + String.format("%.2f", celsius10));
    }
}
