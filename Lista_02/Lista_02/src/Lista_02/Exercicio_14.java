package Lista_02;
import java.util.*;

public class Exercicio_14 {
    public static void main(String[] args) {

        int num1, num2, dif;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            dif = num1 - num2;

        }else{
            dif = num2 - num1;
        }

        System.out.println("A diferença do maior para o menor é: " + dif);
    }
}