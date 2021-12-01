import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        int x;

        for (x = 0; x < 10; x++) {
            while (a[x] <= 0) {
                System.out.println("Insira um valor inteiro positivo Vetor A:");
                a[x] = input.nextInt();
            }
        }
        for (x = 0; x < 10; x++) {
            while (b[x] <= 0) {
                System.out.println("Insira um valor inteiro positivo Vetor B:");
                b[x] = input.nextInt();
            }
        }
        c=uni(a,b);
        System.out.println("Vetor de união de A e B:");
        for (x=0;x<20;x++){
            System.out.println(c[x]+" ");
        }
    }
    public static int[] uni(int[] a, int[] b){
        int c[] = new int[20];
        int x;
        for (x=0;x<20;x++){
            if (x<10){
                c[x]=a[x];
            }else{
                c[x]=b[x-10];
            }
        }
        return c;
    }
}
