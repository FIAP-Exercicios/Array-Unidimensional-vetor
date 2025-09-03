import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int Qarquivos;
        System.out.println("Quantos arquivos vamos ler--> ");
        Qarquivos= sc.nextInt();

        String[] Nome= new String[Qarquivos];
        long[] Tamanho= new long[Nome.length];

        for (int i=0; i < Qarquivos; i++){
            sc.nextLine();
            System.out.println("Qual é o nome do arquivo "+ (i+1) + "--> ");
            Nome[i]=sc.nextLine();
            System.out.println("Me fale o tamanho em Bytes--> ");
            Tamanho[i]= sc.nextLong();
            System.out.println();
        }

        for (int k=0; k < Qarquivos; k++){

            System.out.print(Nome[k]+ " | ");
            System.out.print(Tamanho[k] / (1024*1024) +"(MB) | " );
            System.out.println(Tamanho[k]  / (1024*1024*1024) +"(GB) | ");

        }





    }
}
