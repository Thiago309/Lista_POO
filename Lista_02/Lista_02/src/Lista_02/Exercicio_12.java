package Lista_02;
import java.util.*;

public class Exercicio_12 {
    public static void main(String[] Arg){

    int X;
    Scanner input = new Scanner(System.in);

    System.out.print("Informe o valor: ");
    X = input.nextInt();

    if(X >= 0){
        X = X;

    }else{
        X = X * -1;

    }

    System.out.print("O modo de X é: " + X);

    }
}