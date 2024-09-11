package Lista_02;
import java.util.*;

public class Exercicio_21 {
    public static void main(String[] Args){
        int a, opcao = 0;
        Scanner input = new Scanner(System.in);

        while(opcao == 0){
            System.out.print("Informe o valor que deseja analisar: ");
            a = input.nextInt();

            if (a > 0){
                System.out.println("O valor é positivo!");

            }else{
                System.out.println("O valor é negativo!");
            }

           System.out.print("Deseja continuar analisar valores? (1 - S/ 0 - N): ");
           opcao = input.nextInt();

        }
        System.out.println("Fim do programa...");

    }
}
