import java.util.Scanner;

public class ExercicioVinteTres {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int cod, pos, mes;
        double sal;

        /*
        Thread.sleep(valorQualquer) eh um codigo que serve para dar 
        uma pausa de um tempo definido pelo programador.
        OBS: ele necessita de uma extensao 'throws InterruptedException'
        apos o 'public static void main(String[] args)'
        */

        do {

            System.out.println("\n::Menu de opções::\n1- Novo salário\n2- Férias\n3- Décimo terceiro\n4- Sair\n\nEscolha uma opção:");
            cod = input.nextInt();
            if (cod == 1) {//condicao para codigo igual a 1
                System.out.print("\nOlá, vamos calcular seu novo salário!\nQual seu salário atual?\nR:");
                sal = input.nextDouble();
                calculando();
                if (sal > 600.00) {//condicao para salario maior que 600
                    sal += sal * 5 / 100;
                } else if (sal >= 210.00 && sal >= 600.00) {//condicao para salario entre 210 e 600
                    sal += sal * 10 / 100;
                } else if (sal < 210.00) {//condicao para salario menor que 210
                    sal += sal * 15 / 100;
                }
                System.out.println("\nSeu novo salário é R$" + sal);
                Thread.sleep(2000);
            } else if (cod == 2) {//condicao para codigo igual a 2
                System.out.print("\nOlá, vamos calcular o valor das suas férias!\nQual seu salário atual?\nR:");
                sal = input.nextDouble();
                calculando();
                sal += sal / 3;
                System.out.println("\nO valor das suas férias é R$" + sal);
                Thread.sleep(2000);
            } else if (cod == 3) {//condicao para codigo igual a 3
                System.out.print("\nOlá, vamos calcular o seu décimo terceiro!\nQual seu salário atual?\nR:");
                sal = input.nextDouble();
                System.out.print("\nQauntos meses de trabalho na empresa?(máximo de até 12 meses)\nR:");
                mes = input.nextInt();
                if (mes > 12 || mes < 1) {//condicao para verificar valor de meses invalidos
                    System.out.println("Quantidade de meses inválido!!\nTente novamente!!");
                } else {//condicao para meses validos
                    calculando();
                    sal = sal*mes / 12;
                    System.out.println("\nO valor do seu décimo terceiro é R$" + sal);
                    Thread.sleep(2000);
                }
            }else if(cod<1 || cod>4){//condicao para codigos invalidos
                System.out.println("Valor inválido!!");
                Thread.sleep(500);
            }

        } while (cod != 4);//repeticao para fazer o programa varias vezes

        System.out.println("Fim do programa!!");

    }

    private static void calculando() throws InterruptedException {//funcao criada apenas com proposito visual para o console
        System.out.print("\nCalculando.");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".\n");
    }

}
