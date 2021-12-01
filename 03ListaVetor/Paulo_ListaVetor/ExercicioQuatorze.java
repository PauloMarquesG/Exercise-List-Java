import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome[] = new String[5];
        int salario[] = new int[5];
        int temp[] = new int[5];
        int x;

        for (x=0;x<2;x++){// repeticao para receber um valor
            System.out.println("Insira seu nome aqui:");
            nome[x] = input.next();
            System.out.println("Insira seu salário aqui:");
            salario[x] = input.nextInt();
            System.out.println("Insira seu tempo de trabalho aqui:\n(Em anos)");
            temp[x] = input.nextInt();
        }
        for (x=0;x<2;x++){
            if (temp[x]>5 && salario[x]<400){ // todas opções
                salario[x] += salario[x]*35/100;
            }else if (temp[x]>5){ // tempo
                salario[x] += salario[x]*25/100;
            }else if (salario[x]<400){ // salario
                salario[x] += salario[x]*15/100;
            }else{ // nenhuma

            }
        }

    }

}
