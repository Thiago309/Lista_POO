package Lista_01;
import java.util.*;

public class Exercicio_07 {
    public static void main(String Arg[]){

        double F = 0, C = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em Fahrenheit: ");
        F = input.nextDouble();

        /*Calculo de conversão de  Fahrenheit ~> Celsius.*/
        C = (F - 32) * 5/9;

        System.out.printf("A temperatura em Graus Gelsius é: %.2f Cº", C);
    }
}
