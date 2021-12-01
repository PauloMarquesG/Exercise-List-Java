import java.util.Scanner;

public class ExercicoDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, e, x, i, fat;

        System.out.println("Insira um valor positivo e inteiro:");
        num = input.nextDouble();
        e = 1;
        fat = 1;
        for (x = 1; x <= num; x++) {  //repeticao de quantos valores o usuario escolheu

            for (i = 1; i <= x; i++) {  //repeticao para fazer a conta de fatorial
                fat = fat * i;
            }
            e = e + 1 / fat;
        }

        System.out.println("Valor de E é: " + e);

    }
}
