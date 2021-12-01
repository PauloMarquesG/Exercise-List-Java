import java.util.Scanner;

public class ExercicioDezesete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num[] = new int[6];
        int par=0,impar=0;
        int x;

        for (x=0;x<6;x++){// repeticao para receber um valor
            System.out.println("Insira um valor:");
            num[x]=input.nextInt();
        }

        System.out.println("\n:Os números pares são:");
        for (x=0;x<6;x++){
            if (num[x]%2==0){
                System.out.println("Número "+num[x]+" na posição "+(x+1));
                par+=num[x];
            }
        }
        System.out.println("\nSoma dos pares: "+ par);

        System.out.println("\n:Os números ímpares são:");
        for (x=0;x<6;x++){
            if (num[x]%2!=0){
                System.out.println("Número "+num[x]+" na posição "+(x+1));
                par+=num[x];
            }
        }
        System.out.println("\nSoma dos ímpares: "+ par);

    }
}
