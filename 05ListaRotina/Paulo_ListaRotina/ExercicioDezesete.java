import java.util.Scanner;

public class ExercicioDezesete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matri[][] = new int[5][5];
        int x, y;

        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                System.out.println("Preencha a posição ("+x+", "+y+"):");
                matri[x][y] = input.nextInt();
            }
        }
        System.out.println("A soma das matrizes é: "+soma(matri));

    }
    public static int soma(int[][] matri){
        Scanner input = new Scanner(System.in);
        int x,y,soma = 0;

        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
               soma += matri[x][y];
            }
        }
        return soma;
    }
}
