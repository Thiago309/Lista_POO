package Lista_04;
import java.util.*;

public class Exercicio_03 {
    public static void main(String[] args) {

        String nome = "";
        char c;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        nome = input.nextLine();

        String[] conect = {"das", "de", "di", "du", "e", "do", "da", "dos"};

        String iniciais = "";
        boolean newName = true; // Flag para indicar se a palavra atual é um nome

        for (int i = 0; i < nome.length(); i++) {
            c = nome.charAt(i);

            // verifica se a minha string for uma letra.
            if (Character.isLetter(c)) {

                if (newName) {
                    iniciais += Character.toUpperCase(c);
                    newName = false; //Reinicia a flag para a próxima palavra.

                }
            } else {
                newName = true; //Se a substring não for letra, a próxima é uma palavra é um nome.

            }
        }
        System.out.println("As iniciais são: " + iniciais);
        input.close();
    }
}

