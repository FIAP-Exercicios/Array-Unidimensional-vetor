import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int total,aux;

        System.out.println("Total de números--> ");
        total= sc.nextInt();
        int [] v= new int[total];


        //entrada de dados
        for (int i=0; i< v.length;i++){

            System.out.println("valor--> ");
            v[i] = sc.nextInt();

        }
        System.out.println("\n Dados invertidos");
        for (int i=0; i < v.length; i++){

            System.out.println(v[i]+ " ");

        }

        //Inversão

        for (int i= 0; i<v.length/2;i++){

            aux = v[i];
            v[i] = v[v.length-1];
            v[v.length-1] = aux;

        }

        System.out.println("\n Dados antes da inversão");
        for (int i=0; i< v.length; i++){

            System.out.println(v[i] + " ");

        }


    }
}
