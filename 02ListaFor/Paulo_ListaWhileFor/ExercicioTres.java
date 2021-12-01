import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,num,i,j,fat;

        System.out.println("Insira uma quantidade de valores a serem lidos:");
        n = input.nextInt();

        for (i=1;i<=n;i++){  //repeticao de quantos valores o usuario escolheu
            System.out.println("Insira um número para o fatorial:");
            num = input.nextInt();
            fat=1;
            for (j=1;j<=num;j++){  //calcula o fatorial
                fat = fat*j;
            }
            System.out.println(num +"! -> "+ fat);
        }

    }
}
