import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, idade, opn, mIdade = 0, qPessoas = 0, qPessoasB = 0;

        for (x = 1; x <= 15; x++) {  //repeticao
            System.out.println("Qual a sua idade?");
            idade = input.nextInt();
            System.out.println("Qual sua opnião sobre o filme?\n 1 - Regular | 2 - Bom | 3 - Ótimo");
            opn = input.nextInt();
            if (opn==1 ||opn==2 ||opn==3) {  //verifica se a opcao escolhida pelo usuario eh valida

                if (opn == 1) {
                    qPessoas += 1;
                } else if (opn == 2) {
                    qPessoasB += 1;
                } else if (opn == 3) {
                    mIdade += idade;
                }

            }else{  //mensagem de erro
                System.out.println("\n\nErro...\nTente novamente!\n\n");
                x--;
            }

        }

        System.out.println("A média de idade das pessoas que responderam Ótimo é " + mIdade / (15 - qPessoas - qPessoasB));
        System.out.println("A de pessoas que responderam Regular é " + qPessoas);
        System.out.println("A porcentagem de pessoas que responderam Bom é " + qPessoasB * 100 / 15 + "%");

    }
}
