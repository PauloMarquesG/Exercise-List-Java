import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat[][] = new double[10][20];
        double soma[] = new double[10];
        int x, z;

        for (x = 0; x < 10; x++) {
            for (z = 0; z < 20; z++) {
                System.out.println("Digite o valor da cordenada (" + x + "," + z + ") na matriz:");
                mat[x][z] =1; //input.nextDouble();
            }
        }
        for (x = 0; x < 10; x++) {
            soma[x] = 0;
            for (z = 0; z < 20; z++) {
                soma[x] += mat[x][z];
            }
        }
        for (x = 0; x < 10; x++) {
            for (z = 0; z < 20; z++) {
                mat[x][z] *= soma[x];
            }
        }
        System.out.println("::Matriz resultante::");
        for (x = 0; x < 10; x++) {
            System.out.println("Linha "+x);
            for (z = 0; z < 20; z++) {
                System.out.println(mat[x][z]+" ");
            }
        }
    }
}
