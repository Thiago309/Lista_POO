package Lista_04;
import java.util.*;

public class Exercicio_01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String nome = "";
        int c = 0, qtdDigitos = 0, qtdVogais = 0,qtdCaracter = 0;


        System.out.print("Informe a String que você deseja analisar: ");
        nome = input.nextLine();

        qtdCaracter = nome.length();
        System.out.print("A string contém " + qtdCaracter + " caracteres. \n");

        String newName = nome.toUpperCase();
        System.out.println(newName);

        for(c = 0; c < qtdCaracter; c++){
            String v = String.valueOf(newName.charAt(c));

            if(v.contains("A") || v.contains("E") || v.contains("I") || v.contains("O") || v.contains("U")){
                qtdVogais++;

            }

            if(v.contains("0") || v.contains("1") || v.contains("2") || v.contains("3") || v.contains("4") ||
                v.contains("5") || v.contains("6") || v.contains("7") || v.contains("8") || v.contains("9")){
                qtdDigitos++;

            }
        }

        newName = newName.trim();
        boolean poli = newName.equals(new StringBuffer(newName).reverse().toString());

        if(poli){
            System.out.println("A String é um polindromo...");

        }else{
            System.out.println("A String não é um polindromo...");

        }


        if(newName.startsWith("UNI")){
            System.out.println("A string digitada começa com \"UNI\"");

        }else if(newName.endsWith("RIO")) {
            System.out.println("A String digitada termina com \"RIO\"");

        }else{
            System.out.println("A String não contém nenhuma das duas opções");

        }
        System.out.println("A String contém "+qtdDigitos+" digitos.");
        System.out.println("O numero de vogais da string é: " +qtdVogais);
        input.close();
    }
}
