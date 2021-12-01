import java.util.Scanner;

public class ExercicioVinteQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, maior, menor;

        System.out.println("Insira um valor:");
        num = input.nextInt();
        maior = num;
       menor = num;

        do {

            System.out.println("Insira um valor:");
            num = input.nextInt();
            if (num > 0) {//condicao verificar se o valor eh maior que 0
                if (num > maior) {//condicao para caso numero seja maior que o valor da vairavel maior
                    maior = num;
                } else if (num < menor) {//condicao para caso numero seja menor que o valor da vairavel menor
                    menor = num;
                }
            } else if (num<0){//condicao para valores invalidos menor que 0
                System.out.println("\nValor negativo não irá para os calculos!!\n");
            }

        } while (num != 0);//repeticao para fazer a comparacao de maior e menor

        System.out.println("\n\nO maior valor é " + maior + " e o menor é " + menor);

    }
}
