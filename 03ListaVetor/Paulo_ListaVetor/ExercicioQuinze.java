import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num[] = new int[10];
        int div[] = new int[5];
        int x, z,aux;

        for (x = 0; x < 10; x++) {// repeticao para receber um valor
            System.out.println("Insira um valor para o Primeiro vetor::");
            num[x] = input.nextInt();
        }
        for (x = 0; x < 5; x++) {// repeticao para receber um valor
            System.out.println("Insira um valor para o Segundo vetor::");
            div[x] = input.nextInt();
        }
        for (x = 0; x < 10; x++) {
            aux=0;
            System.out.println("\nNúmero " + num[x]);
            for (z = 0; z < 5; z++) {
                if (num[x] % div[z] == 0) {
                    System.out.println("Divisível por " + div[z] + " na posição " + (z+1));
                    aux++;
                }
            }
            if (aux==0){
                System.out.println("Não possui divisores no segundo vetor");
            }
        }


    }
}

