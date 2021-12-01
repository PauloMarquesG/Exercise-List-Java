import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, num, qPrimo = 0;

        for (x = 1; x <= 10; x++) {  //repeticao para pedir dez valores
            System.out.println("Digite um número inteiro:");
            num = input.nextInt();

            if (Primo(num)) {  //resgata o valor da funcao
                qPrimo += 1;
            }

        }

        System.out.println("A quantidade de númeos primos é " + qPrimo);

    }

    //funcao para saber a quantidade de numeros que sao primos
    private static boolean Primo(int num) {
        int j;
        for (j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

}
