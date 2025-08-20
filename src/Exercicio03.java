import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DecimalFormat fc= new DecimalFormat("0.00");

        int total, aprovados= 0;
        double nota;

        System.out.println("Qual o total de alunos--> ");
        total= sc.nextInt();

        double[] media= new double[total];

        for (int i=0; i < media.length; i++){

            System.out.println("Aluno"+(i+1)+"--> ");
            nota=0;
            for (int n=0; n< 4; n++){
                System.out.println("Nota " +(n+1)+"--> ");
                nota+= sc.nextDouble();
            }

            media[i] = nota / 4;
            System.out.println("\n -------------------------------------------------------------------");

        }

        for (int i = 0; i < media.length; i++){

            System.out.println("Aluno "+(i+1) + "--> " + fc.format(media[i]));
            if (media[i] >= 6){
                aprovados++;
            }

        }
        System.out.println("Total de alunos aprovados--> ");
    }
}
