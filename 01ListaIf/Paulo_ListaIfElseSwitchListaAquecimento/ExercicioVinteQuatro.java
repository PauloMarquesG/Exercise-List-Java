import java.util.Scanner;

public class ExercicioVinteQuatro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double imp = 0, prec, cat, aum = 0, precFinal;
        String sit = null;

        System.out.print("Qual o preço do produto?\nR$");
        prec = input.nextDouble();
        System.out.println("\n\nValor - Descrição\n  1   - Limpeza\n  2   - Alimentação\n  3   - Vestuário\n\nDigite o valor correspondente ao seu produto::");
        cat = input.nextDouble();
        if (cat >= 1 && cat <= 3) {

            if (prec <= 25) {
                if (cat == 1) {
                    aum = prec * 5 / 100;
                } else if (cat == 2) {
                    aum = prec * 8 / 100;
                } else {
                    aum = prec * 10 / 100;
                }
            } else if (prec > 25) {
                if (cat == 1) {
                    aum = prec * 12 / 100;
                } else if (cat == 2) {
                    aum = prec * 15 / 100;
                } else {
                    aum = prec * 18 / 100;
                }
            }

            System.out.println("Letra - Descrição\n  R   - Produtos que necessitam de refrigeração\n  N   - Produtos que não necessitam de refrigeração\n\nDigite a letra correspondente ao seu produto::");
            sit = input.next();
            if (sit.equals("R") || sit.equals("N")) {

                if (cat == 2 || sit.equals("R")) {
                    imp = prec * 5 / 100;
                } else {
                    imp = prec * 8 / 100;
                }

            } else {
                System.out.println("Código da situação inválido!");
            }

        } else {
            System.out.println("Código da categoria inválido!");
        }

        if (cat >= 1 && cat <= 3) {
            if (sit.equals("R") || sit.equals("N")) {
                System.out.println("O valor do aumento é R$" + aum);
                System.out.println("O valor do imposto é R$" + imp);
                System.out.println("O novo preço é R$" + (prec + aum - imp));
                if ((prec + aum - imp) <= 50) {
                    System.out.println("A classificação é 'Barato'");
                } else if ((prec + aum - imp) > 50 && (prec + aum - imp) < 120) {
                    System.out.println("A classificação é 'Normal'");
                } else if ((prec + aum - imp) >= 120) {
                    System.out.println("A classificação é 'Caro'");
                }
            }
        }

    }

}