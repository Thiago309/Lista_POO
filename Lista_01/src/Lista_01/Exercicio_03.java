package Lista_01;
import java.util.*;

public class Exercicio_03 {
    public static void main(String args[]){

        String Vend = "", peca ="";
        double ler_peca = 0, ler_Vend = 0, ID_peca1 = 32, ID_peca2 = 345, ID_vend1 = 1234,
                ID_vend2 = 4321, Vl_peca = 0, Com = 0, qtd_peca = 0;

        Scanner ler = new Scanner(System.in);

        //Identificando o vendedor.
        System.out.print("Informe o ID do Vendedor: ");
        ler_Vend = ler.nextDouble();

        if(ler_Vend == ID_vend1){
            Vend = "Ana";

        }else if(ler_Vend == ID_vend2){
            Vend = "Eduardo";

        }else{
            Vend = "Vendedor não encontrado";

        }

        /*Encontrando a peça no sistema.*/
        System.out.print("Informe o ID da Peça vendida: ");
        ler_peca = ler.nextDouble();

        if (ler_peca == ID_peca1){
            peca = "Resistor";
            Vl_peca = 1.15;

        }else if (ler_peca == ID_peca2) {
            peca = "Capacitor";
            Vl_peca = 3.65;
        }else{
            System.out.println("Peça não encontrada em nossos sistemas!");
            peca = "Error";
            Vl_peca = 0;
        }

        /*Informando a quantidade peças vendida.*/
        System.out.print("Informe a quantidade de peças vendidas: ");
        qtd_peca = ler.nextDouble();

        Com = (qtd_peca * Vl_peca) + 1.05;

        System.out.printf("O vendedor "+Vend+" vendeu "+qtd_peca+" "+peca+" e deverar receber R$"+Com+" de comissão.");
    }
}
