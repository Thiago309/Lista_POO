package Lista_03;

public class Exercicio_30 {
    public static void main(String[] Args){
        int res, x, y;

        for(x = 0; x <=10; x++){

            System.out.println("\n========================\n");
            for(y = 0; y <=10; y++){
                res = x * y;
                System.out.printf("%d x %d = %d\n",x ,y, res);
            }
        }
    }
}
