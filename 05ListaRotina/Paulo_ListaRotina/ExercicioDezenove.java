import java.util.Scanner;

public class ExercicioDezenove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matri[][] = new int[6][6];
        int matri2[][] = new int[6][6];
        int x, y;

        for (x = 0; x < 6; x++) {
            for (y = 0; y < 6; y++) {
                System.out.println("Preencha a posição (" + x + ", " + y + "):");
                matri[x][y] = input.nextInt();
            }
        }
        matri2 = diag(matri);
        for (x = 0; x < 6; x++) {
            for (y = 0; y < 6; y++) {
                System.out.print(matri2[x][y]);
            }
            System.out.println("");
        }

    }

    public static int[][] diag(int[][] matri) {
        int x, y, z, m = 0;
        int matri2[][] = new int[6][6];

        z = 0;
        for (x = 0; x < 6; x++) {
            for (y = 0; y < 6; y++) {
                    matri2[x][y]=matri[x][y]*matri[x][z];
            }
            z++;
        }

        return matri2;

    }
}
