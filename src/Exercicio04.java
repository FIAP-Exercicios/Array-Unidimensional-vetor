import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double media=0;

        String[] m={"Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};
        double [] t = new double[m.length];

        //entrada das temperaturas
        for (int i= 0; i < t.length; i++){

            System.out.println("Temperatura de " +m[i]+ "--> ");
            t[i]= sc.nextDouble();
            media+=t[i];
        }

        // calculo da média
        media = media / m.length;
        System.out.println("MEDIA DE SUA TEMPERATURA ANUAL--> "+media);
        for (int i = 0; i < t.length; i++){
            if (t[i] > media){

                System.out.println(m[i] + " --> " + t[i]);

            }

        }



    }
}
