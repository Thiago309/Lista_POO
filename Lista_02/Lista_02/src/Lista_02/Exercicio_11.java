package Lista_02;
import java.util.*;

public class Exercicio_11 {
    public static void main(String[] Arg){

        Double A, B, Aux = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        A = input.nextDouble();

        System.out.print("Informe o valor de B: ");
        B = input.nextDouble();

        if(A != null){

            Aux = A;
            A = B;
        }

        if(B !=null){

            B = Aux;
        }

        System.out.print("A: " + A);
        System.out.print("\nB: " + B);
    }
}
