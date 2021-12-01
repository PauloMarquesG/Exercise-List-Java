import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat[][] = new int[2][2];
        int resultado[][] = new int[2][2];
        int x, z, maior;

        for (x = 0; x < 2; x++) {
            for (z = 0; z < 2; z++) {
                System.out.println("Digite o elemento da coordenada ("+(x+1)+","+(z+1)+"):");
                mat[x][z] = input.nextInt();
            }
        }
        maior = mat[0][0];
        for (x = 0; x < 2; x++) {
            for (z = 0; z < 2; z++) {
                if (mat[x][z]>maior){
                    maior = mat[x][z];
                }
            }
        }
        for (x = 0; x < 2; x++) {
            for (z = 0; z < 2; z++) {
                resultado[x][z] = maior * mat[x][z];
            }
        }
        System.out.println("::Matriz resultante::");
        for (x = 0; x < 2; x++) {
            for (z = 0; z < 2; z++) {
                System.out.println(resultado[x][z]+" ");
            }
        }

    }
}
