import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, num, sPar = 0, sPri = 0;

        for (x = 1; x <= 10; x++) {  //repeticao para pedir dez valores
            System.out.println("Insira o " + x + "º valor:");
            num = input.nextInt();

            if (num % 2 == 0) {
                sPar += num;
            } else if (Primo(num)) {
                sPri += num;
            }

        }

        System.out.println("Soma dos númeos primos :" + sPri);
        System.out.println("Soma dos números pares :" + sPar);

    }

    //Solucao que achei na internt para saber se um valor eh primo ou nao.
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
