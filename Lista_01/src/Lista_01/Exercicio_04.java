package Lista_01;
import java.util.*;

public class Exercicio_04 {
    public static void main(String arg[]){
        /*Declaração das Variáveis*/
        double A = 0, B = 0, C = 0, D = 0, R = 0, R1 = 0, R2 = 0,
        R3 = 0, R4 = 0, R5 = 0;
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        A = ler.nextDouble();

        System.out.print("Informe o valor de B: ");
        B = ler.nextDouble();

        System.out.print("Informe o valor de C: ");
        C = ler.nextDouble();

        System.out.print("Informe o valor de D: ");
        D = ler.nextDouble();

        /*Propriedades Distributivas*/
        R = A + B;
        System.out.printf("%.2f + %.2f = %.2f\n", A, B, R);

        R = A + C;
        System.out.printf("%.2f + %.2f = %.2f\n", A, C, R);

        R = A + D;
        System.out.printf("%.2f + %.2f = %.2f\n\n", A, D, R);

        R1 = B + A;
        System.out.printf("%.2f + %.2f = %.2f\n", B, A, R1);

        R1 = B + C;
        System.out.printf("%.2f + %.2f = %.2f\n", B, C, R1);

        R1 = B + D;
        System.out.printf("%.2f + %.2f = %.2f\n\n", B, D, R1);

        R2 = C + A;
        System.out.printf("%.2f + %.2f = %.2f\n", C, A, R2);

        R2 = C + B;
        System.out.printf("%.2f + %.2f = %.2f\n", C, B, R2);

        R2 = C + D;
        System.out.printf("%.2f + %.2f = %.2f\n\n", C, D, R2);


        R3 = A * B;
        System.out.printf("%.2f * %.2f = %.2f\n", A, B, R3);

        R3 = A * C;
        System.out.printf("%.2f * %.2f = %.2f\n", A, C, R3);

        R3 = A * D;
        System.out.printf("%.2f * %.2f = %.2f\n\n", A, D, R3);

        R4 = B * A;
        System.out.printf("%.2f * %.2f = %.2f\n", B, A, R4);

        R4 = B * C;
        System.out.printf("%.2f * %.2f = %.2f\n", B, C, R4);

        R4 = B * D;
        System.out.printf("%.2f * %.2f = %.2f\n\n", B, D, R4);

        R5 = C * A;
        System.out.printf("%.2f * %.2f = %.2f\n", C, A, R5);

        R5 = C * B;
        System.out.printf("%.2f * %.2f = %.2f\n", C, B, R5);

        R5 = C * D;
        System.out.printf("%.2f * %.2f = %.2f\n\n", C, D, R5);
    }
}
