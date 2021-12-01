import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, x;

        System.out.println("Insira um valor::");
        num = input.nextInt();

        x = verifica(num);
        if (x==0){
            System.out.println("Número Negativo!");
        }else{
            System.out.println("Número Positivo!");
        }

    }

    public static Integer verifica(int num) {
        int res;
        if (num >= 0) {
            res = 1;
        } else {
            res = 0;
        }
        return (res);
    }
}
