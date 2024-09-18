package Lista_02;
import java.util.*;

public class Exercicio_25 {
    public static void main(String[] args){
        Double h, kg;
        String gen = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu gênero [m] - Masculino / [f] - Feminino: ");
        gen = input.next();

        if(gen.equals("m") || gen.equals("M")){
            System.out.print("Entendemos que seu genero é o Masculino. Agora por favor informe sua altura: ");
            h = input.nextDouble();

            kg = (72.7 * h) - 58;

            System.out.printf("O peso ideal para você é: %.2f", kg);

        }else if(gen.equals("f") || gen.equals("F")){
            System.out.print("Entendemos que seu genero é o Feminino. Agora por favor informe sua altura.");
            h = input.nextDouble();

            kg = (62.1 * h) - 44.7;

            System.out.printf("O peso ideal para você é: %.2f", kg);

        }else{
            System.out.println("Opção invalida, tente novamente amastarde!!!");

        }
    }
}