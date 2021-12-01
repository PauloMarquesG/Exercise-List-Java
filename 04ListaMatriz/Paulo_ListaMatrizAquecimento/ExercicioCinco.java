import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat[][] = new int[4][7];
        int menor, maior, x, z, linhaM, col;

        for (x = 0; x < 4; x++) {
            for (z = 0; z < 7; z++) {
                System.out.println("Digite o valor para coordenada (" + x + "," + z + "):");
                mat[x][z] = input.nextInt();
            }
        }
        menor = mat[0][0];
        linhaM = 0;
        for (x = 0; x < 4; x++) {
            for (z = 0; z < 7; z++) {
                if (mat[x][z] < menor) {
                    menor = mat[x][z];
                    linhaM = x;
                }
            }
        }
        maior = mat[linhaM][0];
        col = 0;
        for (x = 0; x < 7; x++) {
            if (mat[linhaM][x] > maior) {
                maior = mat[linhaM][x];
                col = x;
            }
        }
        System.out.println("O elemento minmax = " + maior + " esta na linha " + linhaM + " na coluna " + col);

    }
}
