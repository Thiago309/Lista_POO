package Lista_03;
import java.util.*;

public class Exercicio_38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String end = "";

        int c = 0, hTrab = 0,  hNormal = 50;;
        double salarioTotal = 0.0, salario = 0.0, salarioExcedente = 0.0;

        do {

            System.out.print("Informe o código do operário: ");
            c = input.nextInt();
            System.out.print("Informe o número de horas trabalhadas: ");
            hTrab = input.nextInt();

            if (hTrab > hNormal) {
                salario = hNormal * 10.00;
                salarioExcedente = (hTrab - hNormal) * 20.00;

            } else {
                salario = hTrab * 10.00;
                salarioExcedente = 0.0;

            }

            salarioTotal = salario + salarioExcedente;

            System.out.printf("O código do operário: %d\n", c);
            System.out.printf("O salário total: R$ %.2f\n", salarioTotal);
            System.out.println("Salário excedente: R$ " + salarioExcedente);

            System.out.print("Deseja encerrar o programa? (S/s) para sim: ");
            end = input.next();

        } while ((!end.equals("S")) && (!end.equals("s")));

        System.out.println("Fim do programa. Obrigado por utilizar nossos serviços!!!");
        input.close();
    }
}