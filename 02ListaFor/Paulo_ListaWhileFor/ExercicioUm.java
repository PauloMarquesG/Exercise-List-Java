import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double i, anoAtual,sal=1000,novoSal,perc=1.5/100;

        System.out.println("Qual o ano atual?");
        anoAtual = input.nextDouble();

        novoSal = sal + perc * sal;

        for (i=2007 ; i<=anoAtual ; i++){  //repeticao para fazer a conta
            perc *= 2;
            novoSal = novoSal + perc * novoSal;
        }
        System.out.println("O novo salário é R$ "+ novoSal);
    }
}
