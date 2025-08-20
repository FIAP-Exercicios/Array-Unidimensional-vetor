import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int total;

        System.out.println("Total de números--> ");
        total= sc.nextInt();
        int [] v= new int[total];
        boolean especial= true;

        //entrada de dados
        for (int i=0; i< v.length;i++){

            System.out.println("valor--> ");
            v[i] = sc.nextInt();

        }

        //verificar se o arry é especial ou não
        for (int i=0; i< v.length-1; i++){

            if (v[i] % 2 == v[i +1] % 2){
                especial = false;
                break;
            }

        }
        if (especial){
            System.out.println("Array é especial");
        }else {
            System.out.println("Array não é espcial");
        }

    }
}
