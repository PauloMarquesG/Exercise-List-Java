import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  num[] = new int[9];
        int x;

        for (x=0;x<9;x++){// repeticao para receber os valores
            System.out.println("Insira um valor:");
            num[x] = input.nextInt();
        }
        for (x=0;x<9;x++){// repeticao para mostrar a posicao do valor primo
            if (Primo(num[x])){
                System.out.println("Valor primo "+num[x]+" na posição "+(x+1));
            }
        }

    }

    private static boolean Primo(int num) {// funcao para encontrar valores primos
        int j;
        for (j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

}
