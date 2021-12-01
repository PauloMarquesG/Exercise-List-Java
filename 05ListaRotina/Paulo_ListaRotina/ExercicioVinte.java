import java.util.Scanner;

public class ExercicioVinte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matri[][] = new int[12][12];
        int x,y;

        for (x = 0; x < 12; x++) {
            for (y = 0; y < 12; y++) {
                System.out.println("Preencha a posição (" + x + ", " + y + "):");
                matri[x][y] = input.nextInt();
            }
        }
        System.out.println(diag(matri));

    }
    public static int diag(int[][] matri) {
        int x, y, z, media = 0;


        for (x = 1; x < 12; x+=2) {
            for (y = 0; y < 11; y++) {
                media += matri[x][y];
                System.out.println(media);
            }
        }
        media /= 66;
        return media;

    }
}

