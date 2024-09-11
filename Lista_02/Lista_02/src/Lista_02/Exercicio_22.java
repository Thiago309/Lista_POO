package Lista_02;
import java.util.*;

public class Exercicio_22 {
    public static void main(String[] args) {
        Double A = 0.0, B = 0.0, x;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor que você deseja analisar: ");
        x = input.nextDouble();

        if( x > 0){
            A = x;

        }else{
            B = x;

        }

        System.out.printf("A: %.2f | B: %.2f", A, B);
    }
}
