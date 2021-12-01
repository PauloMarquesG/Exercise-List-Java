import java.io.IOException;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        double vlr,somaVista = 0,somaPrazo = 0,somaTotal = 0,somaPrazoj = 0;
        String cod;

        for (x=1;x<=15;x++){  //repeticao para fazer a conta com quinze compras diferentes
            System.out.println("Insira o valor da compra (exemplo R$0,00):");
            vlr = input.nextDouble();
            System.out.println("Insira:: V para à Vista | P para a Prazo");
            cod = input.next();

            if (cod.equals("V") || cod.equals("v")){  //verifica se eh a vista
                somaVista += vlr;
                somaTotal += vlr;
            }else if (cod.equals("P") || cod.equals("p")){  //verifica se eh a prazo
                somaPrazo += vlr;
                somaTotal += vlr;
                somaPrazoj += vlr/3;
            }else {  //mensagem de erro
                System.out.println("\n\n\n\n\n\nOpção de compra incorreta!!\n Tente novamente!");
                // ( x--; ) serve para refazer
                x--;
            }
        }

        System.out.println("\n\nO valor total de compras à vista é R$"+ somaVista);
        System.out.println("O valor total de compras a prazo é R$"+ somaPrazo);
        System.out.println("O valor da primeira parcela de cada compra a prajo é R$"+ somaPrazoj);
        System.out.println("O valor total das compras é R$"+ somaTotal);

    }
}
