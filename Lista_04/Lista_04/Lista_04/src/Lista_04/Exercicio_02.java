package Lista_04;
import java.util.*;

public class Exercicio_02 {
    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);
        int qtdNumero;
        String numero, v;

        System.out.print("Digite o numero: ");
        numero = input.nextLine();
        qtdNumero = numero.length();

        for(int c = 0; c <= qtdNumero; c++){
            v = String.valueOf(numero.charAt(c));

            if(v.contains("0")){
                System.out.print("Zero, ");

            }if(v.contains("1")){
                System.out.print("Um, ");

            }if(v.contains("2")){
                System.out.print("Dois, ");

            }if(v.contains("3")){
                System.out.print("Três, ");

            }if(v.contains("4")){
                System.out.print("Quatro, ");

            }if(v.contains("5")){
                System.out.print("Cinco, ");

            }if(v.contains("6")){
                System.out.print("Seis, ");

            }if(v.contains("7")){
                System.out.print("Sete, ");

            }if(v.contains("8")){
                System.out.print("Oito, ");

            }if(v.contains("9")){
                System.out.print("Nove, ");

            }
        }
        input.close();

    }
}
