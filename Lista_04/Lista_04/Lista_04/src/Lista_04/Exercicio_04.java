package Lista_04;
import java.util.*;

public class Exercicio_04 {
    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);
        String texto = "";
        int qtdCaracteres = 0, qtdPalavras = 0;

        System.out.print("Digite o texto: ");
        texto = input.nextLine();
        qtdCaracteres = texto.length();
        String[] palavras = texto.split("\\s+"); // Divide o texto em palavras usando espaços como delimitador
        qtdPalavras = palavras.length;
        System.out.println("O numero total de caracteres é: " + qtdCaracteres);
        System.out.println("O numero de palavras: " + qtdPalavras);

        input.close();
    }
}
