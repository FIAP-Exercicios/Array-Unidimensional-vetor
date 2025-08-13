import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] x= new int[10];
        int pares=0, impares=0;

        for (int i= 0; i < x.length; i++) {
            System.out.println("Me fale qual foi a nota que você tirou--> ");
            x[i] = sc.nextInt();

            if (x[i] % 2==0){
                pares++;
            }
            else {
                impares++;
            }
        }
        System.out.println("Quantidade de pares= " + pares);
        System.out.println("Quantidade de impar= " + impares);


    }
}
