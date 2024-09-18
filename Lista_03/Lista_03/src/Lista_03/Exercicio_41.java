package Lista_03;
import java.util.*;

public class Exercicio_41 {
    public static void main(String[] args) {

        int n = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        n = input.nextInt();

        if((n >= 5) && (n <= 7)){
            System.out.println("Público infantil A.");

        }else if((n >= 8) && (n <= 11)) {
            System.out.println("Público infantil B.");

        }else if((n >= 12) && (n <= 13)) {
            System.out.println("Público Juvenil A.");

        }else if((n >= 14) && (n <= 17)) {
            System.out.println("Público Juvenil B.");

        }else if(n >= 18) {
            System.out.println("Maiores de 18 anos.");

        }else{
            System.out.println("Idade incorreta, fim do sistema!!!");

        }
    }
}