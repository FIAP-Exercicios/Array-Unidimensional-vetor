import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] x= new int[10];
        int maior= Integer.MIN_VALUE, menor=Integer.MAX_VALUE;

        for (int i= 0; i < x.length; i++) {
            System.out.println("Me fale qual foi a pontuação que você tirou--> ");
            x[i] = sc.nextInt();

            if (x[i] > maior){
                maior = x[i];
            } else if (x[i] < menor) {
                menor = x[i];
            }
        }
        System.out.println("Maior valor= " + maior);
        System.out.println("Menor valor= " + menor);


    }
}
