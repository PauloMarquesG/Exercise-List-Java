import java.util.Scanner;

public class ExercicioDexesete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Csal, Jsal, mes = 0;

        System.out.println("Qual o salário do Carlos:");
        Csal = input.nextInt();
        Jsal = Csal / 3;//salario do joao

        while (Jsal < Csal) {//repeticao para contar quanto tempo vai levar
            Jsal += Jsal * 5 / 100;
            Csal += Csal * 2 / 100;
            mes++;
        }

        System.out.println("Para que o valor do João iguale ou ultrapasse o valor do Carlos é necessário " + mes + " meses");

    }
}
