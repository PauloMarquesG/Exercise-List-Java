import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matri[][] = new int[6][4];
        int matri2[][] = new int[6][4];
        int x, z, cont = 0;

        for (x = 0; x < 6; x++) {
            for (z = 0; z < 4; z++) {
                System.out.println("Preencha a martiz na coordenada (" + x + "," + z + "):");  // leitura para a primeira matriz
                matri[x][z] = input.nextInt();
                if (matri[x][z] > 30) {
                    cont++;
                }
                if (matri[x][z] == 30) {
                    matri2[x][z] = 0;
                } else {
                    matri2[x][z] = matri[x][z];
                }
            }
        }
        System.out.println("Quantidade de valores maior que 30: "+cont);
        System.out.println("::Valores da 2º matriz::");
        for (x = 0; x < 6; x++) {
            for (z = 0; z < 4; z++) {
                System.out.println(matri2[x][z]+" coordenadas: ("+x+","+z+")");
            }
        }

    }
}
