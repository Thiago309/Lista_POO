package Lista_02;
import java.util.*;

public class Exercicio_15 {
    public static void main(String[] Args){

        double n1, n2, n3, n4, rec, med;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a nota 1: ");
        n1 = input.nextDouble();

        System.out.print("Informe a nota 2: ");
        n2 = input.nextDouble();

        System.out.print("Informe a nota 3: ");
        n3 = input.nextDouble();

        System.out.print("Informe a nota 4: ");
        n4 = input.nextDouble();

        med = (n1 + n2 + n3 + n4) / 4;

        if(med >= 7){
            System.out.printf("Aluno aprovado por média !!! \nMédia: %.2f", med);

        }else{
            System.out.printf("Média: %.2f Aluno está na recuperação. Por favor informe a nota " +
                    "de recuperação do aluno: ", med);
            rec = input.nextDouble();

            Double newMed = (rec + med) / 2;

            if(newMed >= 7){
                System.out.printf("Média: %.2f o aluno foi aprovado na recuperação!", newMed);

            }else{
                System.out.printf("Média: %.2f o aluno foi reprovado na recuperação!", newMed);

            }
        }
    }
}