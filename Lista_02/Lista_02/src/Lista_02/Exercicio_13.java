package Lista_02;
import java.util.*;

public class Exercicio_13 {
    public static void main(String[] Args){

        int A, B, C;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        A = input.nextInt();

        System.out.print("Digite o valor B: ");
        B = input.nextInt();

        System.out.print("Digite o valor C: ");
        C = input. nextInt();

        if ((A < B) && (A < C)){
            if(B < C){
                System.out.printf("%d %d %d", A , B , C);

            }else{
                System.out.printf("%d %d %d", A , C , B);

            }

        }else if((B < A) && (B < C)){
            if(A < C){
                System.out.printf("%d %d %d", B , A , C);
            }else{
                System.out.printf("%d %d %d", B , C , A);
            }

        }else{
            if(A < B){
                    System.out.printf("%d %d %d", C , A , B);

            }else{
                System.out.printf("%d %d %d", C , B, A);
            }
        }
    }
}

/*
A B C
A C B

B A C
B C A

C A B
C B A
*/