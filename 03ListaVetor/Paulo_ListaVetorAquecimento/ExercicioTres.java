import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[20];
        int x,z=0;

        for (x=0;x<10;x++){// repeticao para receber os valores
            System.out.println("Insira um valor:");
            vet1[x]=input.nextInt();
            vet3[z] = vet1[x];
            z++;
            System.out.println("Insira um valor:");
            vet2[x]=input.nextInt();
            vet3[z] = vet2[x];
            z++;
        }
        System.out.println("::Vetor resultante da intercalação::");
        for (x=0;x<20;x++){// repeticao para mostrar o vetor resultante
            System.out.println(vet3[x]);
        }


    }
}
