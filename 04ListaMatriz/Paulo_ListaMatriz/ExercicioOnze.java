import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matri[][] = new int[8][8];
        int x, z, contAux = 0;

        for (x = 0; x < 8; x++) {
            for (z = 0; z < 8; z++) {
                System.out.println("Digite um valor para a matriz:\nLinha " + x + " Coluna " + z);
                matri[x][z] = input.nextInt();
            }
        }

        for (x = 0; x < 8; x++) {
            for (z = 0; z < 8; z++) {
                if (matri[x][z] == matri[z][x]) {
                    contAux++;
                }
            }
        }

        if (contAux == 64) {
            System.out.println("A matriz digitada é simétrica!");
        } else {
            System.out.println("A matriz digitada não é simétrica!");
        }


    }
}
