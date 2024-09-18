package Lista_03;
import java.util.Scanner;

public class Exercicio_42 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double max = 0, min = 0, n;
        int c = 0;

        while (true) {
            System.out.print("Digite o valor que você deseja analisar: ");
            n = input.nextDouble();

            if (n == 0){
                break;

            }

            if (c == 0){
                max = n;
                min = n;
                c++;

            }else{
                if(n > max){
                    max = n;

                }
                if(n < min){
                    min = n;

                }
            }
        }
        System.out.printf("O Maior valor é: %.2f e o Menos valor é: %.2f.", max, min);
        input.close();
    }
}