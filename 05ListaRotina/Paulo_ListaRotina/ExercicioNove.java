import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {

        MaiorMenor();

    }

    public static void MaiorMenor() {
        Scanner input = new Scanner(System.in);
        int maior = 0, menor = 0, x, num;
        for (x = 1; x <= 5; x++) {
            System.out.println("Insira um novo valor:");
            num = input.nextInt();
            if (x == 1) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                } else if (num < menor) {
                    menor = num;
                }
            }
        }
        System.out.println("O maior número é: " + maior + "\nO menor número é: " + menor);
    }

}
