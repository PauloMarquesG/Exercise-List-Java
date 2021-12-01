import java.util.Scanner;

public class ExercicioVinteCinco {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int tipo, cod;
        double rendi = 0, inves, contInves = 0, contJuros = 0;

        do {

            System.out.println("\nInsira seu código:");
            cod = input.nextInt();
            if (cod > 0) {//condicao para verificar a validade do codigo
                System.out.println("Qual o valor investido?");
                inves = input.nextInt();
                System.out.println("Qual o tipo de investimento?");
                tipo = input.nextInt();
                if (tipo == 1) {//condicao para a primeira forma de investimento
                    rendi = inves * 1.5 / 100;
                } else if (tipo == 2) {//condicao para a segunda forma de investimento
                    rendi = inves * 2 / 100;
                } else if (tipo == 3) {//condicao para a terceira forma de investimento
                    rendi = inves * 4 / 100;
                } else if (tipo > 3) {//condicao para uma forma de investimento invalida
                    System.out.println("\nOpção de investimento inválida!!\n");
                }
                if (tipo > 0 && tipo < 4) {//condicao para mostrar o rendimento das condicoes validas
                    contInves += inves;
                    contJuros += rendi;
                    System.out.println("\nO rendimento mensal vai ser de R$" + rendi);
                    Thread.sleep(1000);
                }
            }
        } while (cod > 0);//repeticao para poder atender uma quantidade ilimitada de clientes

        System.out.println("\n\nO valor total de investido foi de R$" + contInves + "\nO valor total de juros foi de R$" + contJuros);
        System.out.println("\nFim do Programa!");
    }
}
