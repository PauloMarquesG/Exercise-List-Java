import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, idade, qtdPeso = 0, numIdade = 0;
        double altura, peso, numAltura = 0, somaAltura = 0;

        for (x = 1; x <= 25; x++) {  //repeticao apra fazer a pesquisa vinte e cinco vezes
            System.out.println("Qual a sua idade?");
            idade = input.nextInt();
            System.out.println("Qual a sua altura? (Em Metros)");
            altura = input.nextDouble();
            System.out.println("Qual seu peso? (Em Quilogramas)");
            peso = input.nextDouble();

            if (idade > 50) {
                numIdade += 1;
            }
            if (idade > 10 && idade < 20) {
                numAltura += 1;
                somaAltura += altura;
            }
            if (peso < 40) {
                qtdPeso += 1;
            }

        }

        System.out.println("A quantidade de pessoas que tem mais de 50 anos é " + numIdade);
        System.out.println("A média de altura entre as pessoas de 10 a 20 é " + (somaAltura / numAltura) + " m");
        System.out.println("A porcentagem de pessoas com peso inferior a 40kg é " + (qtdPeso * 100 / 2) + "%");

    }
}
