import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, x, mIdade = 0, qPA = 0, pIA = 0;
        double peso, altura;

        for (x = 1; x <= 10; x++) {
            System.out.println("Quantos anos você tem?");
            idade = input.nextInt();
            System.out.println("Qual a sua altura? (Em metros)");
            altura = input.nextDouble();
            System.out.println("Qual o  seu peso? (Em Quilogramas)");
            peso = input.nextDouble();

            //soma para calcular a media das idades
            mIdade += idade;

            if (peso > 90 && altura < 1.50) {  //verifica peso e altura
                qPA += 1;
            }
            if (idade > 10 && idade < 30 && altura > 1.90) {  //verifica idade e altura
                pIA += 1;
            }

        }

        System.out.println("A média de idade das 10 (dez) pessoas é " + (mIdade / 10));
        System.out.println("A quantidade de pessoas com peso superior a 90 kg e altura menor a 1,50m é " + qPA);
        System.out.println("A porcentagem de pessoas com idade entre 10 e 30 anos e maior que 1.90m é " + (pIA * 10) + "%");

    }
}
