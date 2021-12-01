import java.util.Scanner;

public class ExercicioVinteUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] candidatos = new int[6];//criacao da array para guardar a quantidade de votos de cada candidato

        int cod, percN, percB, x, somaVoto = 0;

        do {

            System.out.print("::Candidatos::\n  1 - Klebin |  2 - Vinicin |  3 - Gustavin |  4 - Lucin |  5 - Voto Nulo |  6 - Voto Branco\n\nEm qual você vai votar?\nR:");
            cod = input.nextInt();
            if (cod >= 1 && cod <= 6) {//condicao para verificar se a opcao de voto eh valida

                for (x = 1; x < 7; x++) {//repeticao para marcar votos
                    if (x == cod) {//condicao apra comparar codigo com o valor da repeticao
                        candidatos[x - 1]++;//contador de voto para cado candidato com a utilizacao de array
                        somaVoto++;//contador de votos no total
                    }
                }

                System.out.println("\n\nObrigado por votar!!\n\n");
            } else if (cod > 6 || cod < 0) {//condicao para opcao de voto invalida
                System.out.println("-=-=-=-=-=-=-=-=--=-=-=-\nOpção de voto inválida!!\n   Tente Novamente!!\n-=-=-=-=-=-=-=-=-=-=--=-\n");
            }else{//condicao apenas para quebrar uma linha
                System.out.println("\n");
            }
        } while (cod != 0);//repeticao para fazer a votacao inumeras vezes

        for (x = 0; x <= 3; x++) {//repeticao para mostrar a quantidade de voto de todos os candidatos
            System.out.println("Quantidade de votos para o " + (x + 1) + "º candidato é: " + candidatos[x]);
        }
        System.out.println("A quantidade de votos nulos é: " + candidatos[4] + "\nA quantidade de votos bracos é: " + candidatos[5]);
        System.out.println("A porcentagem de votos nulos sobre o total de votos é: "+ (candidatos[4]*100/somaVoto)+"%\nA porcentagem de votos brancos sobre o total de votos é: "+ (candidatos[5]*100/somaVoto)+"%");
    }

}
