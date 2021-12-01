import java.util.Scanner;

public class ExercicioDezoito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matri[][] = new int[6][6];
        int x, y;

        for (x = 0; x < 6; x++) {
            for (y = 0; y < 6; y++) {
                System.out.println("Preencha a posição ("+x+", "+y+"):");
                matri[x][y] = input.nextInt();
            }
        }
        System.out.println("O menor valor da segunda diagonal é: "+menor(matri));

    }
    public static int menor(int[][] matri){
        int x, z, m=0;

        z=5;
        for (x = 0; x < 6; x++) {
            if (x==1){
                m = matri[z][x];
            }else{
                if (matri[z][x]<m){
                    m=matri[z][x];
                }
            }
            z--;
        }

        return m;

    }
}
