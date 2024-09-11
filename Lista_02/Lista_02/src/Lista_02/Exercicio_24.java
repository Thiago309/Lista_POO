package Lista_02;
import java.util.*;

public class Exercicio_24 {
    public static void main(String[] Args){
        int A, B, res, opc = 0;
        Scanner input = new Scanner(System.in);

        while (opc != 4){
            System.out.println("Selecione a opção que você deseja utilizar:\n" +
                    "1. Verificar múltiplos.\n" +
                    "2. Verificar se são pares.\n" +
                    "3. Verificar se a média de ambos são maiores ou igual a 7.\n" +
                    "4. Sair.\n");

            opc = input.nextInt();

            switch(opc){
                case 1:
                    System.out.print("Digite o valor do A: ");
                    A = input.nextInt();

                    System.out.print("Digite o valor do B: ");
                    B = input.nextInt();

                    res = A % B;

                    if(res == 0){
                        System.out.println("O valor A é multiplo de B.");
                        break;

                    }else{
                        System.out.println("O valor A não é multiplo de B.");
                        break;

                    }

                case 2:
                    System.out.print("Digite o valor do A: ");
                    A = input.nextInt();

                    System.out.print("Digite o valor do B: ");
                    B = input.nextInt();

                    res = A % 2;
                    int res1 = B % 2;

                    if(res == 0){
                        System.out.println("O valor A é par!");

                    }else{
                        System.out.println("O valor A é impar!");
                    }

                    if (res1 == 0){
                        System.out.println("O valor B é par!");
                        break;

                    }else{
                        System.out.println("O valor B é impar!");
                        break;

                    }

                case 3:
                    System.out.print("Digite o valor do A: ");
                    A = input.nextInt();

                    System.out.print("Digite o valor do B: ");
                    B = input.nextInt();

                    res = (A + B) / 2;

                    if (res >= 7){
                        System.out.println("A média é maior ou igual a 7.");
                        break;

                    }else{
                        System.out.println("A média é menor que 7.");
                        break;

                    }

                case 4:
                    System.out.print("Obrigado por utilizar nossos serviços...");
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente...\n");

            }
        }
    }
}