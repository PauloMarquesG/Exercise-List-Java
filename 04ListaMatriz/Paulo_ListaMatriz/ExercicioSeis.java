import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat1[][] = new int[4][5];
        int mat2[][] = new int[2][5];
        int reslt[][] = new int[4][2];
        int x, z, j, i, a, b;

        for (x = 0; x < 4; x++) {
            for (z = 0; z < 5; z++) {
                System.out.println("Preencha a primeira martiz na coordenada (" + x + "," + z + "):");  // leitura para a primeira matriz
                mat1[x][z] = 1;//input.nextInt();
            }
        }
        for (x = 0; x < 2; x++) {
            for (z = 0; z < 5; z++) {
                System.out.println("Preencha a segunda martiz na coordenada (" + x + "," + z + "):");  // leitura para a segunda matriz
                mat2[x][z] = 1;//input.nextInt();
            }
        }

        for (a = 0; a < 4; a++) {
            for (b = 0; b < 2; b++) {  //repetição para a matriz resultante

                x = a;  //condição para que a linha que vá rodar da primeira matriz seja para a primeira célula da resultante
                for (z = 0; z < 5; z++) { // repetição para rodar as colunas da linha do codigo acima

                    j = b; //condição para que a linha que vá rodar da segunda matriz seja para a primeira célula da resultante
                    for (i = 0; i < 5; i++) { // repetição para rodar as colunas da linha do codigo acima

                        if (z == i) { // condição para saber se é valido a inserção de um valor na matriz resultante
                            /*
                            * Explicando o de cima, caso as colunas de ambas as matrizes 1 e 2 n sejam a mesma
                            * a conta n estará correta
                            * */

                            reslt[a][b] += (mat1[x][z] * mat2[j][i]); //inserindo resultado

                        }

                    }


                }

            }
        }

        for (a = 0; a < 4; a++) {
            for (b = 0; b < 2; b++) {
                System.out.println(reslt[a][b]+" coordenadas: ("+a+","+b+")");
            }
        }

    }
}
