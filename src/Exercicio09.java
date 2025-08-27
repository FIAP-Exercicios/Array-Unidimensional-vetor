import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int QuantidadeF, S;
        Scanner sc= new Scanner(System.in);
        DecimalFormat dc= new DecimalFormat("0.00");

        System.out.println("Quantidade de Funcionários--> ");
        QuantidadeF= sc.nextInt();

        String[] N= new String[QuantidadeF];
        Double[] salario= new Double[QuantidadeF];
        double MSalario=0;
        int posicao;


        double media= 0.0, total= 0.0;

        for (int i=0; i < N.length; i++){

            System.out.println("Nome do Funcionário " +(i+1)+"--> ");
            N[i]= sc.next();

            System.out.println("Salario do Funcionário "+(i+1)+"--> ");
            salario[i]=sc.nextDouble();

            if (salario[i] > MSalario){

                MSalario = salario[i];
                posicao=i;

            }
        }

        for (int k=0; k < N.length; k++){

            total=+ salario[k];
        }

        System.out.println("==========================================================================");
        for (int i=0; i < N.length;i++){

            System.out.println("Funcionário "+(N[i]+ " - Salário "+"R$"+dc.format(salario[i])));

        }
        System.out.println("Media de salário mensal--> "+dc.format(media = total / N.length));
        System.out.println("");


    }
}
