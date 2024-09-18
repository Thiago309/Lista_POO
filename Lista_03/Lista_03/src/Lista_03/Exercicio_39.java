package Lista_03;
import java.util.*;

public class Exercicio_39 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 0;
        String end = "";

        do{
            System.out.print("Digite o valor que deseja analisar: ");
            n = input.nextInt();



            if(n % 2 != 0){
                if ( n < 0){
                    System.out.println("O numero é Impar e Negativo!");

                }else{
                    System.out.println("O numero é Impar e Positivo!");

                }

            }else{
                if (n < 0){
                    System.out.println("O numero é Par e Negativo!");

                }else{
                    System.out.println("O numero é Par e Positivo!");

                }
            }

            System.out.print("\nDeseja sair da função analisar? (S/s): ");
            end = input.next();

        }while((!end.equals("S")) && (!end.equals("s")));

        input.close();
    }
}
