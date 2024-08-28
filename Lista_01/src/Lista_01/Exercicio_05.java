package Lista_01;
import java.util.*;

public class Exercicio_05 {
    static public void main(String Arg[]){

        double AutoKm = 12, T = 0, VelMed = 0, Dist = 0, QtdLitros = 0;

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o tempo gasto pela viagem: ");
        T = ler.nextDouble();

        System.out.print("Informe a velocidade utilizada durante o percurso da viagem: ");
        VelMed = ler.nextDouble();

        /*Calculo da distância percorrida durante a viagem.*/
        Dist = T * VelMed;

        QtdLitros = Dist / AutoKm;

        System.out.printf("A quantidade de litros de combustivel utilizidado nesta viagem foi de: %.2fL", QtdLitros);

    }
}
