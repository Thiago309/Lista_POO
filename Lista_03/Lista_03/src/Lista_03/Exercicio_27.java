package Lista_03;
import java.util.Scanner;

public class Exercicio_27 {
    public static void main(String[] args) {

        int c = 1, qtd, n = 0, fat = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de analise fatorial de numeros.");

        /*Lê a quantidade de números para processamento fatorial.*/
        System.out.print("Digite a quantidade de números que deseja processar: ");
        qtd = input.nextInt();

        /*Realiza o fatorial de cada numero que o usuario selecionou*/
        for (c = 1; c <= qtd; c++) {

            System.out.printf("Digite o número %d: ", c);
            n = input.nextInt();

            /*calculo fatorial*/
            for (int i = 1; i <= n; i++) {
                fat *= i;

            }

            System.out.printf("O fatorial de %d! é: %d\n", n, fat);
            fat = 1;
        }

        input.close();
    }
}