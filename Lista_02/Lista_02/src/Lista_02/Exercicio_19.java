package Lista_02;
import java.util.*;

public class Exercicio_19 {
    public static void main(String[] Args){
        Double A, B, C;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do lado A do triângulo: ");
        A = input.nextDouble();

        System.out.print("Digite o valor do lado B do triângulo: ");
        B = input.nextDouble();

        System.out.print("Digite o valor do lado C do triângulo: ");
        C = input.nextDouble();


        if (A < B + C && B < A + C && C < A + B){
            if (A == B && B == C){
                System.out.println("O triângulo é equilátero.");

            }
            else if (A == B || A == C || B == C){
                System.out.println("O triângulo é isósceles.");

            }

            else{
                System.out.println("O triângulo é escaleno.");
            }

        } else{
            System.out.println("Os valores fornecidos não formam um triângulo.");

        }
    }
}
