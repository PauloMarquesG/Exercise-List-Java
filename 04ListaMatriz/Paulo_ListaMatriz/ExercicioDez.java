import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matri[][] = new int[10][10];
        int x, z, y, aux;

        for (x=0;x<10;x++){
            for (z=0;z<10;z++){
                matri[x][z]= input.nextInt();
            }
        }

        for (x=0;x<10;x++){
            aux=matri[1][x];
            matri[1][x]=matri[7][x];
            matri[7][x]=aux;
        }

        for (x=0;x<10;x++){
            aux=matri[x][3];
            matri[x][3]=matri[x][9];
            matri[x][9]=aux;
        }
        z=0;
        y=9;
        for (x=0;x<10;x++){
            aux=matri[z][x];
            matri[z][x]=matri[y][x];
            matri[y][x]=aux;
            z++;
            y--;
        }

        for (x=0;x<10;x++){
            aux=matri[4][x];
            matri[4][x]=matri[x][9];
            matri[x][9]=aux;
        }

        for (x=0;x<10;x++){
            for (z=0;z<10;z++){
                if (z<=8){
                    System.out.print(matri[x][z]+" | ");
                }else{
                    System.out.print(matri[x][z]+"\n");
                }
            }
        }

    }
}
