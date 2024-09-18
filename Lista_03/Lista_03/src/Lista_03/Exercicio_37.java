package Lista_03;
import java.util.*;


public class Exercicio_37 {

    public static void main(String[] Args){
        int opc = 0;
        double A, B, result;
        Scanner input = new Scanner(System.in);
        String R = "";

        do{
            System.out.println("Selecione a opção que você deseja usar na calculadora:\n" +
                    "1. Adição.\n" +
                    "2. Subtração.\n" +
                    "3. Multiplicação.\n" +
                    "4. Divisão.\n"
                    );

            opc = input.nextInt();

            switch(opc) {
                case 1:
                    System.out.print("Digite o valor do A: ");
                    A = input.nextDouble();

                    System.out.print("Digite o valor do B: ");
                    B = input.nextDouble();

                    result = A + B;
                    System.out.println("Resultado: \n" + result);

                    System.out.print("Deseja voltar a função principal?: ");
                    R = input.nextLine();
                    break;

                case 2:
                    System.out.print("Digite o valor do A: ");
                    A = input.nextDouble();

                    System.out.print("Digite o valor do B: ");
                    B = input.nextDouble();

                    result = A - B;
                    System.out.println("Resultado: " + result);

                    System.out.print("Deseja voltar a função principal?: ");
                    R = input.nextLine();
                    break;

                case 3:
                    System.out.print("Digite o valor do A: ");
                    A = input.nextDouble();

                    System.out.print("Digite o valor do B: ");
                    B = input.nextDouble();

                    result = A * B;
                    System.out.println("Resultado: " + result);

                    System.out.print("Deseja voltar a função principal?: ");
                    R = input.nextLine();
                    break;

                case 4:
                    System.out.print("Digite o valor do A: ");
                    A = input.nextDouble();

                    System.out.print("Digite o valor do B: ");
                    B = input.nextDouble();

                    result = A / B;
                    System.out.println("Resultado: " + result);

                    System.out.print("Deseja voltar a função principal?: ");
                    R = input.nextLine();
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente...");
                    opc = input.nextInt();
            }
            R = input.nextLine();

        }while(R.equals("S")||R.equals("s"));
        System.out.println("\nFim do programa.");
        input.close();
    }
}