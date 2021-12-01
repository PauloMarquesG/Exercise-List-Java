import java.util.Scanner;

public class ExercícioVinteTres {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cod, qtdProd, prec = 0, desc = 0, precFinal = 0;

        System.out.println("Insira o código do produto comprado:");
        cod = input.nextInt();
        if (cod >= 1 && cod <= 10) {
            System.out.println("Insira a quantidade comprada do produto:");
            qtdProd = input.nextInt();

            System.out.println("\n\nO preço unitário do produto é R$10");
            prec = 10 * qtdProd;

        } else if (cod >= 11 && cod <= 20) {
            System.out.println("Insira a quantidade comprada do produto:");
            qtdProd = input.nextInt();

            System.out.println("\n\nO preço unitário do produto é R$15");
            prec = 15 * qtdProd;

        } else if (cod >= 21 && cod <= 30) {
            System.out.println("Insira a quantidade comprada do produto:");
            qtdProd = input.nextInt();

            System.out.println("\n\nO preço unitário do produto é R$20");
            prec = 20 * qtdProd;

        } else if (cod >= 31 && cod <= 40) {
            System.out.println("Insira a quantidade comprada do produto:");
            qtdProd = input.nextInt();

            System.out.println("\n\nO preço unitário do produto é R$30");
            prec = 30 * qtdProd;

        } else {
            System.out.println("Código Errado!\nTente novamento!");
        }

        if (cod >= 1 && cod <= 40) {
            if (prec <= 250) {
                desc = prec * 5 / 100;
                precFinal = prec - desc;
            } else if (prec > 250 && prec < 500) {
                desc = prec * 10 / 100;
                precFinal = prec - desc;
            } else if (prec >= 500) {
                desc = prec * 15 / 100;
                precFinal = prec - desc;
            }

            System.out.println("O preço total da nota R$" + prec + ",00");
            System.out.println("Valor do desconto é R$" + desc+ ",00");
            System.out.println("Preço final é R$" + precFinal+ ",00");
        }
    }

}