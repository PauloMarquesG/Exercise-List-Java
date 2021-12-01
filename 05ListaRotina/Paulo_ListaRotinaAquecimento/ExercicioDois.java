import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Insira um valor::");
        num1 = input.nextInt();
        System.out.println("Insira um valor::");
        num2 = input.nextInt();

        soma = Soma(num1, num2);

        System.out.println("Soma = " + soma);

    }

    public static Integer Soma(int num1, int num2) {
        int soma = 0, x, aux;
        if (num1 > num2) {
            for (x = (num2 + 1); x <= (num1 - 1); x++) {
                soma += x;
            }
        } else {
            for (x = (num1 + 1); x <= (num2 - 1); x++) {
                soma += x;
            }
        }
        return (soma);
    }
}
