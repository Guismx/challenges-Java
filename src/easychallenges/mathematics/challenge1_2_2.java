//2.1.2 Etiqueta - Escreva um programa que lê do teclado seu nome completo, endereço, CEP e
//telefone, limpa a tela e mostra seu nome na primeira linha, seu endereço na segunda, e o CEP e
//telefone na terceira.

package easychallenges.mathematics;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class challenge1_2_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Write your full name: ");
        String name = teclado.nextLine();

        System.out.println("Write your address: ");
        String address = teclado.nextLine();

        System.out.println("Write your phone number: ");
        String number = teclado.nextLine();

        System.out.println("Name: " + name +"\n" + "Address: " + address + "\n" + "Phone Number: " + number);
    }
}
