import java.util.Scanner;

public class ExercicioDezeseis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num[] = new int[10];
        int soma[] = new int[5];
        int resul1[] = new int[10];
        int resul2[] = new int[10];
        int x, z, aux;

        for (x = 0; x < 10; x++) {// repeticao para receber um valor
            System.out.println("Insira um valor para o Primeiro vetor::");
            num[x] = input.nextInt();
        }
        for (x = 0; x < 5; x++) {// repeticao para receber um valor
            System.out.println("Insira um valor para o Segundo vetor::");
            soma[x] = input.nextInt();
        }

        for (x = 0; x < 10; x++) {
            if (num[x] % 2 == 0) {
                resul1[x] = num[x];
                for (z = 0; z < 5; z++) {
                    resul1[x] += soma[z];
                }
            } else {
                for (z = 0; z < 5; z++) {
                    if (num[x]%soma[z]==0) {
                        resul2[x]++;
                    }
                }
            }
        }
        System.out.println("Primeiro vetor resultante");
       for (x=0;x<10;x++){
           if (resul1[x]!=0) {
               System.out.println(resul1[x]);
           }
       }
       System.out.println("Segundo vetor resultante");
       for (x=0;x<10;x++){
           if (num[x] % 2 != 0) {
               System.out.println(resul2[x]);
           }
       }
    }
}
