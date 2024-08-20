//1.2.4 Tempo livre - Um estudante muito metódico estava matriculado em 6 disciplinas, e dispunha de
//1 hora e 40 minutos para estudar. Sua intenção era dividir o tempo disponível igualmente para as 6
//disciplinas, e descansar livremente o tempo restante. Faça um programa que calcule o tempo que
//ele deve dedicar para cada disciplina e o tempo livre. [Dica: use os operadores div e mod]

package basics.mathematics;

public class challenge1_2_4 {
    public static void main(String[] args) {
       int matriculas = 6;
       int time = 100;

       int divTime = 100 / 6;
       int result = time % matriculas;

       System.out.println("The time you must study each subject will be: " + divTime);
       System.out.println("The remaining time to rest is: " + result);
    }
}
