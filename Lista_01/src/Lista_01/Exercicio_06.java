package Lista_01;
import java.util.*;

public class Exercicio_06 {
    public static void main(String Arg[]){

        double F = 0, C = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em Graus Celsius: ");
        C = input.nextDouble();

        /*Calculo de conversão de Celsius ~> Fahrenheit.*/
        F = (9 * C + 160) / 5;

        System.out.printf("A temperatura em Fahrenheit é: %.2f Fº", F);
    }
}
