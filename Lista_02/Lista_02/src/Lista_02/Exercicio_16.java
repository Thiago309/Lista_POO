package Lista_02;
import java.util.*;

public class Exercicio_16 {
    public static void main(String[] Args){

        double n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor 1: ");
        n1 = input.nextDouble();

        System.out.print("Informe o valor 2: ");
        n2 = input.nextDouble();

        if(n1 > n2){
            System.out.printf("O valor 1: %.2f é maior que o valor 2: %.2f .", n1, n2);

        }else if(n1 == n2){
            System.out.printf("O valor 1: %.2f é igual ao valor 2: %.2f .", n1, n2);

        }else{
            System.out.printf("O valor 1: %.2f é menor que o valor 2: %.2f .", n1, n2);

        }
    }
}
