import java.util.Random;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Random rd= new Random();
        int[] x= new  int[rd.nextInt(1, 10)];

        int maior=0, cont;

        for (int i =0; i < x.length; i++){

            x[i]= rd.nextInt(1, 7);
            System.out.print(x[i] + " ");

        }
        for (int i = 0; i < x.length; i++){

            cont = 0;

            for (int k =0; k< x.length; k++){

                if (x[i] == x[k]){

                    cont++;
                }
            }
            if (cont > maior){

                maior = cont;

            }

        }



    }


}
