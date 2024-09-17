package Lista_03;
import java.util.*;

public class Exercicio_32 {
    public static void main(String[] Args){

        int n = 0, c = 0, sumQuadrados = 0;
        Scanner input = new Scanner(System.in);

        // O usuário deve escrever um número entre 0 e 10
        System.out.print("Digite um número maior que zero e menor que 10: ");
        n = input.nextInt();
        input.close();

        while(c < 20){

            if((n > 0) || (n < 10)){
                if ((n % 2) != 0) {

                    sumQuadrados += n * n;
                    c++;

                }
            } else {
                System.out.println("Número inválido. Tente novamente.");
            }
        n++;
        }

        System.out.println("A soma dos quadrados dos 20 primeiros números ímpares é: " + sumQuadrados);
        input.close();
    }
}