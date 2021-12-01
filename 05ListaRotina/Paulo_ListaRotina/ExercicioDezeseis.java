import java.util.Scanner;

public class ExercicioDezeseis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        int x;

        for (x = 0; x < 10; x++) {
            System.out.println("Insira um valor para o vetor A:");
            a[x] = input.nextInt();
        }
        for (x = 0; x < 10; x++) {
            System.out.println("Insira um valor para o vetor B:");
            b[x] = input.nextInt();
        }
        c = decre(a, b);
        for (x = 0; x < 20; x++) {
            System.out.print(c[x]+" ");
        }
    }

    public static int[] decre(int[] a, int[] b) {
        int c[] = new int[20];
        int z, x, aux;

        for (x = 0; x < 20; x++) {
            if (x < 10) {
                c[x] = a[x];
            } else {
                c[x] = b[x - 10];
            }
        }
        for (x=1;x<c.length;x++){
            for (z=0;z<x;z++){
                if (c[x]>c[z]){
                    aux = c[x];
                    c[x] = c[z];
                    c[z] = aux;
                }
            }
        }
        return c;
    }
}
