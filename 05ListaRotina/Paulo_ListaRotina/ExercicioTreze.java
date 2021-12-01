import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];
        int x;

        for (x=0;x<10;x++){
            System.out.println("Insira um valor para o Vetor A:");
            a[x] = input.nextInt();
        }
        b=Fat(a);
        System.out.println("\nVetor B:");
        for (x=0;x<10;x++){
            System.out.print(b[x]+" ");
        }

    }
    public static  int[] Fat(int[] a){
        int b[] = new int[10];
        int x,z,f;

        for (x=0;x<10;x++){
            f=1;
            for (z=1;z<=a[x];z++){
               f=f*z;
            }
            b[x] = f;
        }

        return b;
    }
}
