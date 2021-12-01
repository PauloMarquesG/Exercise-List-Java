import java.util.Scanner;

public class ExercicioVinteCinco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horasExtras,horasMes,horasFalta,H;

        System.out.println("Número de horas extras em minutos::");
        horasExtras = input.nextInt();
        System.out.println("Quantas horas você tem que trabalhar por mês (em minuto)::");
        horasMes = input.nextInt();
        System.out.println("Quantas horas você faltou ao trabalho::");
        horasFalta = input.nextInt();

        H = horasExtras-(2/3*(horasMes-horasFalta));

        if (H>2400){

            System.out.println("A gratificação é de R$500,00");

        }else if (H>=1800 && H<=2400){

            System.out.println("A gratificação é de R$400,00");

        }else if (H>=1200 && H<1800){
            
            System.out.println("A gratificação é de R$300,00");

        }else if(H>=600 && H<1200){

            System.out.println("A gratificação é de R$200,00");

        }else if (H<600){

            System.out.println("A gratificação é de R$100,00");

        }

    }

}
