package Lista_02;
import java.util.*;

public class Exercicio_18 {
    public static void main(String[] args) {
        int CODIGO;
        Scanner input = new Scanner(System.in);

        CODIGO = input.nextInt();

        switch (CODIGO){
            case 1:
                System.out.print("Um");
                break;

            case 2:
                System.out.print("Dois");
                break;

            case 3:
                System.out.print("Três");
                break;

            default:
                System.out.print("Codigo Invalido");
                break;
        }
    }
}
