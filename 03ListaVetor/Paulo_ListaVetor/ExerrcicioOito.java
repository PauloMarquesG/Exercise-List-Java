import java.util.Scanner;

public class ExerrcicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer vetor1[] = new Integer[5];
        Integer vetor2[] = new Integer[5];
        Integer vetor3[] = new Integer[10];
        Integer x, z, aux;

        for (x = 0; x < 5; x++) {// repeticao para receber um valor
            System.out.println("Insira o valor para o 1º vetor\nNa posição " + (x + 1) + "::");
            vetor1[x] = input.nextInt();
        }
        for (x = 0; x < 5; x++) {// repeticao para receber um valor
            System.out.println("Insira o valor para o 2º vetor\nNa posição " + (x + 1) + "::");
            vetor2[x] = input.nextInt();
        }
        for (x = 0; x < 10; x++) {
            if (x <= 4) {
                vetor3[x] = vetor1[x];
            } else {
                vetor3[x] = vetor2[x - 5];
            }
        }


        for (x=0;x<=5;x++){
            for (z=0;z<4;z++){
                if (vetor1[z]>vetor1[z+1]){
                    aux=vetor1[z];
                    vetor1[z]=vetor1[z+1];
                    vetor1[z+1]=aux;
                }
            }
        }
        for (x = 0; x <= 5; x++) {
            for (z = 0; z < 4; z++) {
                if (vetor2[z] > vetor2[z + 1]) {
                    aux = vetor2[z];
                    vetor2[z] = vetor2[z + 1];
                    vetor2[z + 1] = aux;
                }
            }
        }
        for (x = 0; x <= 10; x++) {
            for (z = 0; z < 9; z++) {
                if (vetor3[z] > vetor3[z + 1]) {
                    aux = vetor3[z];
                    vetor3[z] = vetor3[z + 1];
                    vetor3[z + 1] = aux;
                }
            }
        }


        for (z = 1; z <= 3; z++) {
            if (z ==1 || z ==2) {
                System.out.println("\n::Valores do vator "+z+" em ordem crescente::\n");
                for (x = 0; x < 5; x++) {
                    if (z == 1) {
                        System.out.println(vetor1[x]);
                    } else if (z == 2) {
                        System.out.println(vetor2[x]);
                    }
                }
            } else {
                System.out.println("\n::Valores do vator "+z+" em ordem crescente::\n");
                for (x = 0; x < 10; x++) {
                    System.out.println(vetor3[x]);
                }
            }
        }

    }
}
