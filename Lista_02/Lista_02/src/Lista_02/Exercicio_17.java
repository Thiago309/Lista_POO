package Lista_02;
import java.util.*;

public class Exercicio_17 {
    public static void main(String[] Args){

        double n1;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        n1 = input.nextDouble();

        if((n1 > 0) && (n1 < 9)){
            System.out.print("Valor válido!");

        }else{
            System.out.print("Valor invalido!");

        }
    }
}
