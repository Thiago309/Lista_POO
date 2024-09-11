package Lista_02;
import java.util.*;

public class Exercicio_20 {
    public static void main(String[] Args) {

        Double a, b, c, v1 = 0.0, v2 = 0.0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite um valor de a: ");
            a = input.nextDouble();

            if (a <= 0) {
                System.out.print("Valor invalido! Tente novamente...\n");
            }

        } while (a <= 0);

        do {
            System.out.print("Digite um valor de b: ");
            b = input.nextDouble();

            if (b <= 0) {
                System.out.print("Valor invalido! Tente novamente...\n");
            }

        } while (b <= 0);

        do {
            System.out.print("Digite um valor de c: ");
            c = input.nextDouble();

            if (c <= 0) {
                System.out.print("Valor invalido! Tente novamente...\n");
            }
        } while (c <= 0);

        if ((a < b) && (a < c)) {
            if (b < c) {
                v1 = a * c;  //menor valor lido multiplicado pelo maior.
                v2 = c / a;  //maior valor lido dividido pelo menor.

            }else{
                v1 = a * b;  //menor valor lido multiplicado pelo maior.
                v2 = b / a;  //maior valor lido dividido pelo menor.

            }

        } else if ((b < a) && (b < c)) {
            if (a < c) {
                v1 = b * c;  //menor valor lido multiplicado pelo maior.
                v2 = c / b;  //maior valor lido dividido pelo menor.

            }else{
                v1 = b * a;  //menor valor lido multiplicado pelo maior.
                v2 = a / b;  //maior valor lido dividido pelo menor.

            }

        }else if((c < a) && (c < b)) {
            if (a < b){
                v1 = c * b;
                v2 = b / c;

            }else{
                v1 = c * a;
                v2 = a / c;

            }
        }

        System.out.printf("Valor 01: %.2f e Valor 02: %.2f ", v1, v2);
    }
}

/*
A B C
A C B

B A C
B C A

C A B
C B A
*/

