package Lista_03;
import java.util.*;

public class Exercicio_33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int  c = 0, nMatricula = 98041;
        Double n = 0.0, med = 0.0, sNota = 0.0,nota = 0.0;

        while(true){

            System.out.printf("Informe a nota do aluno, matricula (%d): \n",nMatricula);


            if(nota >= 0.0){

                nota = input.nextDouble();
                n = nota;
                System.out.printf("O aluno Matricula (%d) tirou: (%.2f)\n", nMatricula, n);
                sNota += nota;
                c++;
                nMatricula++;
            }else{

                System.out.println("Nota invalida!!!");
                break;
            }
        }

        med = sNota / c;
        System.out.printf("A média geral foi: %.2f", med);
        input.close();
    }
}
