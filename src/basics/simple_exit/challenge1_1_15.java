//1.1.15 Menu - Elabore um programa que mostre o seguinte menu na tela:
//
// Cadastro de Clientes
//
// 0 - Fim
// 1 - Inclui
// 2 - Altera
// 3 - Exclui
// 4 - Consulta
//
// Opção: _
package basics.simple_exit;

public class challenge1_1_15 {
    public static void main(String[] args) {

        String[] menu = new String[7];
        menu[0] = "Cadastro de Clientes";
        menu[1] = "0 - Fim";
        menu[2] = "1 - Inclui";
        menu[3] = "2 - Altera";
        menu[4] = "3 - Exclui";
        menu[5] = "4 - Consulta";
        menu[6] = "Opção: _";

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }
}
