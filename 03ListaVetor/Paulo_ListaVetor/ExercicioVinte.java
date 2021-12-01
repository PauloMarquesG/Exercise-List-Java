import java.util.Scanner;

public class ExercicioVinte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num[] = new double[5];
        int x, cod;


        do {
            for (x = 0; x < 5; x++) {// repeticao para receber um valor
                System.out.println("\n\nInsira um valor:\n(pode ser real)");
                num[x] = input.nextDouble();
            }
            System.out.println("\n\nInsira um código inteiro:");
            cod = input.nextInt();
            if (cod == 0) {
                System.out.println("\n\n\nFim programa!\n\n");
            } else if (cod == 1) {
                for (x = 0; x < 5; x++) {
                    System.out.print(num[x] + " ");
                }
            } else if (cod == 2) {
                for (x = 4; x >= 0; x--) {
                    System.out.print(num[x] + " ");
                }
            }
        }while(cod!=0);
    }
}
