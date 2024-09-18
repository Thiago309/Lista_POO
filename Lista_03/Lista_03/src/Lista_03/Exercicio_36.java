package Lista_03;

import java.util.*;

public class Exercicio_36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double max = 0, min = 0, n, med = 0, valor = 0;
        int c = 0;

        while (true) {
            System.out.print("Digite o valor que você deseja analisar: ");
            n = input.nextDouble();

            if (n < 0){
                break;

            }

            valor += n;

            if (c == 0){
                max = n;
                min = n;

            }else{
                if(n > max){
                    max = n;

                }
                if(n < min){
                    min = n;

                }
            }


            c++;
        }

        med = valor / c;
        System.out.printf("A média dos valores é: %.2f e o Maior valor é: %.2f e o Menos valor é: %.2f.",med , max, min);
        input.close();
    }
}