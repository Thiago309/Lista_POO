package Lista_04;
import java.util.*;

public class Exercicio_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String txtSemEspaco = "", texto = "";

        System.out.print("Digite o texto: ");
        texto = input.nextLine();

        // O replaceAll substitui todos os espaços em branco (\\s) e substitui por um único espaço
        txtSemEspaco = texto.replaceAll("\\s+", " ");

        System.out.println("Texto sem espaços excedentes: " + txtSemEspaco);
        input.close();

    }
}
