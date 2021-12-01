import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat();
        money.applyPattern(".00");

        int qParc = 0;
        double vCarro, vParc = 0, vfCarro = 0;
        String tipo;

        System.out.println("Qual o valor do carro?");
        vCarro = input.nextDouble();
        System.out.println("Qual a forma de pagamento?\nV - À vista | P - Parcelado");
        tipo = input.next();

        if (tipo.equals("V") || tipo.equals("v")) {   //Verifica o tipo de pagamento como a vista

            vfCarro = vCarro - vCarro * 20 / 100;
            qParc = 0;
            vParc = 0;

            System.out.println("\nPreço Final | Quantidade de parcelas | Valor por Parcela\nR$" + money.format(vCarro + vCarro * (qParc / 2) / 100) + " |           0            |       R$0,00");


        } else if (tipo.equals("P") || tipo.equals("p")) { //Verifica o tipo de pagamento como parcelado
            System.out.println("\nQuantas parcelas? (Conforme a tabela)");
            System.out.println("<---------------------------------------------------------------------------------------------------------->\n|Parcelas  |   6    |   12   |   18   |   24    |   30    |   36    |   42    |   48    |   54    |   60    |\n|Aumento   |   3%   |   6%   |   9%   |   12%   |   15%   |   18%   |   21%   |   24%   |   27%   |   30%   |\n<---------------------------------------------------------------------------------------------------------->");
            System.out.print("Quantidade: ");
            qParc = input.nextInt();

            if (Parcelas(qParc)) {  // Resgata o valor de bollean da funcao como true

                System.out.println("\n\nPreço Final | Quantidade de parcelas | Valor por Parcela\nR$" + money.format(vCarro + vCarro * (qParc / 2) / 100) + " |            " + qParc + "           | R$" + money.format((vCarro + vCarro * (qParc / 2) / 100)/qParc));

            } else if (!Parcelas(qParc)) {  // Resgata o valor de bollean da funcao como false
                System.out.println("Valor de parcelas inválido!");
            }

        } else {  //Mensagem de erro!
            System.out.println("Forma de pagamento errada. Por favor recomece o programa!");
        }
    }

    /*
    * Funcao que criei para saber se a quantidade de parcelas
    * digitadas pelo usuario eh valida ou nao
    * */

    private static boolean Parcelas(int qParc) {
        int aux = 0, aux2;
        aux2 = qParc;
        if (aux2 <= 60) {
            if (aux2 == 6) {
                return true;
            } else {
                while (aux2 > 6) {
                    aux = aux2 - 6;
                    aux2 = aux;
                    if (aux == 0) {
                        aux += 6;
                    }
                }
            }
            if (aux2 == 6) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}