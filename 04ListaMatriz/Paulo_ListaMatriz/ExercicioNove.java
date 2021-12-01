import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matri[][] = new int[15][5];
        int cont[][] = new int[75][2];
        int x, z, j, i, a = 0, aux = 1;

        for (x=0;x<75;x++){
            cont[x][0]=-1;
        }

        for (x = 0; x < 15; x++) {
            for (z = 0; z < 5; z++) {
                System.out.println("Digite um valor positivo:");
                matri[x][z] = input.nextInt();

            }
        }

        for (x = 0; x < 15; x++) {
            for (z = 0; z < 5; z++) {

                for (j = 0; j < 15; j++) {
                    for (i = 0; i < 5; i++) {


                        if (matri[x][z] == matri[j][i]) { // verifica se é valor repetido

                            a = 0;
                            aux = 1;

                            // verifica se já foi registrado o número
                            do {
                                if (matri[x][z] == cont[a][0]) {
                                    cont[a][1] += 1;

                                    aux--;
                                }
                                a++;

                            } while (a > 75 && aux != 0);

                            a = 0;

                            // cadastra o número novo
                            if (aux == 1) {
                                do {
                                    if (cont[a][0] == -1) {
                                        cont[a][0] = matri[x][z];
                                        cont[a][1]++;
                                        aux = 0;
                                    }
                                    a++;
                                } while (a > 75 || aux != 0);
                            }

                            //elimina o valor repetido, para n ter problemas no programa
                            matri[j][i] = 0;
                        }

                    }
                }
            }
        }
        for (x = 0; x < 75; x++) {
            for (z = 0; z < 2; z++) {
                System.out.println(cont[x][z]);
            }
        }

    }
}
