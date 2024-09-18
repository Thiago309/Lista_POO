package Lista_03;
import java.util.*;

public class Exercicio_40 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String end = "";
        Double indPolu = 0.0;

        do {

            System.out.print("Informe o índice de poluição: ");
            indPolu = input.nextDouble();

            if (indPolu >= 0.05 && indPolu <= 0.25) {
                System.out.println("Índice de poluição dentro do nível aceitável.");

            } else if (indPolu >= 0.3 && indPolu < 0.4) {
                System.out.println("Indústrias do 1º grupo devem suspender suas atividades.");

            } else if (indPolu >= 0.4 && indPolu < 0.5) {
                System.out.println("Indústrias do 1º e 2º grupo devem suspender suas atividades.");

            } else if (indPolu >= 0.5) {
                System.out.println("Todos os grupos devem suspender suas atividades.");

            } else {
                System.out.println("Índice de poluição inválido.");

            }

            System.out.print("Deseja encerrar o programa? (S/s) para sim: ");
            end = input.next();

        } while ((!end.equals("S")) && (!end.equals("s")));

        System.out.println("Programa encerrado.");
        input.close();
    }
}
