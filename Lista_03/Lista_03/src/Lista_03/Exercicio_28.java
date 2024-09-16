package Lista_03;

public class Exercicio_28 {
    public static void main(String[] Args){
        int res, i;

        for(i = 100; i <= 200; i++){

            res = i % 2;

            if(res == 0){

                continue;
            }else{

                System.out.println(i);
            }
        }
    }
}
