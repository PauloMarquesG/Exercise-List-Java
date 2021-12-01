import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cont, cod, numVei, numAcid;
        int maior = 0, maiorCid = 0, menor = 0, menorCid = 0;
        int mediaVei, somaVei, mediaAcid;
        int somaAcid, contAcid;

        somaVei = 0;
        somaAcid = 0;
        contAcid = 0;

        for (cont = 1; cont <= 5; cont++) {  //repeticao para ver os dados das cinco cidades
            System.out.println("\n\nQual o código da cidade?");
            cod = input.nextInt();
            System.out.println("Qual o número de veículos de passeio?");
            numVei = input.nextInt();
            System.out.println("Qual o número de acidentes?");
            numAcid = input.nextInt();
            if (cont == 1) {  //verificacao para os primeiros dados
                maior = numAcid;
                maiorCid = cod;
                menor = numAcid;
                menorCid = cod;
            } else if (cont >= 2) {  //verificacao para comparacao dos dados
                if (maior < numAcid) {
                    maior = numAcid;
                    maiorCid = cod;
                } else if (menor > numAcid) {
                    menor = numAcid;
                    menorCid = cod;
                }
            }
            somaVei = somaVei + numVei;
            if (numVei < 2000) {
                somaAcid = somaAcid + numAcid;
                contAcid += 1;
            }
        }
        System.out.println("\nMaior número de acidente e codígo da cidade => " + maior + " - " + maiorCid);
        System.out.println("\nMenor número de acidente e codígo da cidade => " + menor + " - " + menorCid);
        mediaVei = somaVei / 5;
        System.out.println("\nA média de veículos das 5 cidades juntas é " + mediaVei);
        if (contAcid == 0) {
            System.out.println("\nATENÇÂO\n:: Não foi digitado nenhuma cidade com menos de 2000 veículos!! ::");
        } else {
            mediaAcid = somaAcid / contAcid;
            System.out.println("\nA média de acidadentes das cidades com menos de 2000 veículos é " + mediaAcid);
        }

    }
}
