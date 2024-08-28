package Lista_01;
import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {

        int anos, idadeEmDias;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa em anos: ");
        anos = input.nextInt();

        idadeEmDias = anos * 365;

        System.out.println("A idade expressa em dias é: " + idadeEmDias);
    }
}

