package Lista_01;
import java.util.*;
public class Exercicio_02 {
    public static void main(String args[]){

        // valor da cotação do dollar é +- 5.5 reais.
        double ctc_dollar = 0, Convert = 0, Real = 0;
        String Result;
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a cotação do dollar atualmente: ");
        ctc_dollar = ler.nextDouble();

        System.out.print("Informe o valor do em dolares que vocÊ deseja converter em Real: ");
        Convert = ler.nextDouble();

        Real = ctc_dollar * Convert;

        System.out.printf("O valor em Real é: R$ %.2f", Real);
    }
}
