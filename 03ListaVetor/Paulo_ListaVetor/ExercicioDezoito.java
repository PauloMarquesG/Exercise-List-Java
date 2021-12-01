import java.util.Scanner;
import java.util.Random;

public class ExercicioDezoito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerar = new Random();

        int dado[] = new int[20];
        int cont[] = new int[6];
        int x,z;

        for (x=0;x<20;x++){
            dado[x] = gerar.nextInt(6);
            dado[x]++;
        }
        for (x=0;x<20;x++){
            for (z=1;z<=6;z++){
                if (dado[x]==z){
                    cont[z-1]++;
                }
            }
        }
        for (x=0;x<6;x++){
            System.out.println("O número "+(x+1)+" apareceu: "+cont[x]);
        }

    }
}
