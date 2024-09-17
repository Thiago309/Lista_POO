package Lista_03;
import java.util.*;

public class Exercicio_31 {
    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);
        int n, i = 1, v = 0, res, p = 0, imp = 0, par = 0, impar = 0;

        while(v > -1) {

            System.out.printf("Informe o valor (%d): ", i);
            v = input.nextInt();

            res = v % 2;

            if ((res == 0) && (res > -1)) {
                p++;
                System.out.printf("%d é par\n", v);
                par += v;

            } else {
                if(v > -1){
                    imp++;
                    System.out.printf("%d é impar.\n", v);
                    impar += v;

                }
            }
            i++;
        }
        System.out.println("Fim do programa!!!\n");
        System.out.printf("A soma dos %d numeros pares é: %d.\n", p, par);
        System.out.printf("A soma dos %d numeros impares é: %d.\n", imp, impar);
        input.close();

    }
}
