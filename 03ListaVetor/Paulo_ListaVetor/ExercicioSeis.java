import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num[] = new int[10];
        int x,z,aux;
        for (x=0;x<=9;x++){// repeticao para receber um valor
            System.out.println("Digite o "+(x+1)+" número:");
            num[x] =input.nextInt();
        }
        for (x=0;x<10;x++){
            for (z=0;z<9;z++){
                if (num[z]<num[z+1]){
                   aux=num[z];
                   num[z]=num[z+1];
                   num[z+1]=aux;
                }
            }
        }
        System.out.println("::Valores em ordem decrescente::");
        for (x=0;x<=9;x++){
            System.out.println(num[x]);
        }

    }
}
