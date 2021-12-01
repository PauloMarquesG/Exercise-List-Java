import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num;

        System.out.println("Insira um valor para o lugar do N na formula:\nS = 1 + 1/1! + 1/2! + 1/N!");
        num = input.nextDouble();
        System.out.println("\n\nO resultado da formula é: "+sequencia(num));

    }
    public static double sequencia(double num){
        double s=1,y,f;
        int x;
        System.out.print("\nS = 1 ");
        for (x=1;x<=num;x++){
            f=1;
            System.out.print("+ 1/"+x+"! ");
            for (y=1;y<=x;y++){
                f = f*y;

            }
            s += 1/f;
        }

        return s;
    }

}
