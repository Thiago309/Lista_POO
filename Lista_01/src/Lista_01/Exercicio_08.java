package Lista_01;
import java.util.*;

public class Exercicio_08 {
    public static void main(String Arg[]){

        double Cte = 3.14159, R = 0, V = 0, A = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor Raio do produto: ");
        R = input.nextDouble();

        System.out.print("Informe o valor da Altura do produto: ");
        A = input.nextDouble();

        V = Cte * R * R * A;

        System.out.printf("O volume da lata é: %.2f", V);


    }
}
