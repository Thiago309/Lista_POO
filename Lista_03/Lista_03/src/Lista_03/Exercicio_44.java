package Lista_03;
import java.util.*;

public class Exercicio_44 {
    public static void main(String[] Args) {

        Double F = 0.0, C = 0.0, h = 0.0, kgAtual = 0.0, kg = 0.0;

        int opc = 0;
        String R = "";
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Selecione a opção que você deseja usar:\n" +
                    "1. Conversão de Graus Celsius em Graus Fahrenheit.\n" +
                    "2. Conversão de Graus Fahrenheit em Graus Celsius.\n" +
                    "3. Peso ideal do homem.\n" +
                    "4. Peso ideal da mulher.\n");

            opc = input.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Digite o valor da temperatura em Graus Celsius: ");
                    C = input.nextDouble();

                    /*Calculo de conversão de Celsius ~> Fahrenheit.*/
                    F = (9 * C + 160) / 5;

                    System.out.printf("A temperatura em Fahrenheit é: %.2f Fº\n", F);
                    System.out.print("Deseja voltar a função principal?: ");
                    R = input.nextLine();
                    break;

                case 2:
                    System.out.print("Digite o valor da temperatura em Fahrenheit: ");
                    F = input.nextDouble();

                    /*Calculo de conversão de  Fahrenheit ~> Celsius.*/
                    C = (F - 32) * 5 / 9;

                    System.out.printf("A temperatura em Graus Gelsius é: %.2f Cº\n", C);
                    System.out.print("Deseja voltar a função principal?: ");
                    R = input.nextLine();
                    break;

                case 3:
                    System.out.print("Entendemos que seu genero é o Masculino. Agora por favor informe sua altura: ");
                    h = input.nextDouble();

                    kg = (72.7 * h) - 58;

                    System.out.printf("O peso ideal para você é: %.2f\n", kg);
                    System.out.print("Informe seu peso atual: ");
                    kgAtual = input.nextDouble();

                    if (kgAtual > kg) {
                        System.out.println("Você está acima do peso ideal.");

                    }else if(kgAtual == kg){
                        System.out.println("Você está no peso ideal.");

                    }else{
                        System.out.println("Você está abaixo do peso ideal.");

                    }

                    System.out.print("Deseja voltar a função principal?: ");
                    R = input.nextLine();
                    break;

                case 4:
                    System.out.print("Entendemos que seu genero é o Feminino. Agora por favor informe sua altura.");
                    h = input.nextDouble();

                    kg = (62.1 * h) - 44.7;

                    System.out.printf("O peso ideal para você é: %.2f\n", kg);
                    System.out.print("Informe seu peso atual: ");
                    kgAtual = input.nextDouble();

                    if (kgAtual > kg) {
                        System.out.println("Você está acima do peso ideal.");

                    }else if(kgAtual == kg){
                        System.out.println("Você está no peso ideal.");

                    }else{
                        System.out.println("Você está abaixo do peso ideal.");

                    }

                    System.out.printf("O peso ideal para você é: %.2f\n", kg);
                    System.out.print("Deseja voltar a função principal?: ");
                    R = input.nextLine();
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente amastarde!!!");
                    break;
            }
            R = input.nextLine();

        } while (R.equals("S") || R.equals("s"));
        System.out.println("\nFim do Sistema.");
        input.close();
    }
}