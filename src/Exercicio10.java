import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Random rd= new Random();
        int[] x= new int[500];
        int aux;

        //antes da ordenação
        System.out.print("Antes da ordenação");
        for (int i=0; i<x.length; i++){

            x[i]= rd.nextInt(55);
            System.out.print(x[i] + " ");

        }
        // processo de ordenação--> CRESCENTE

        for (int i= 0; i<x.length - 1; i++ ){

            if (x[i] > x[i +1]){

                aux = x[i +1];
                x[i] = x[i +1];
                x[i +1] = aux;

            }
        }

        // Impressão após a ordenação
        System.out.print("\nDepois da ordenação");
        for (int i=0; i<x.length; i++){
            System.out.println(x[i] + " ");

        }

    }
}
