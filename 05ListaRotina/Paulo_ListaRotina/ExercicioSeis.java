import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cond1;
        do {
            System.out.println("\nInsira um valor entre 1 e 9:");
            cond1 = input.nextInt();
            if (cond1 >= 1 && cond1 <= 9) {
                Tabela(cond1);
            }

        } while (cond1 >= 1 && cond1 <= 9);

    }

    public static void Tabela(int cond1) {
        int x, y;
        for (y = 1; y <= cond1; y++) {
            for (x = 1; x <= y; x++) {
                System.out.print(x * y + " ");
            }
            System.out.println("");
        }
    }

}