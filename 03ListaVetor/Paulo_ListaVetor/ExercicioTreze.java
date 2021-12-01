import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int verifica[] = new int[10];
        int x,aux=0;

        for (x=0;x<10;x++){// repeticao para receber um valor
            System.out.println("Insira um valor:");
            verifica[x] = input.nextInt();
        }

        for (x=0;x<10;x++){
            if (verifica[x]>50){
                System.out.println("Um valor acima de 50 esta na posição "+x);
                aux++;
            }
        }
        if (aux==0){
            System.out.println("Nenhum valor inserido é superior a 50!");
        }

    }
}
