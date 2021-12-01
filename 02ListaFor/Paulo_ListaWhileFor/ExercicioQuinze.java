import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, qSim = 0, qNao = 0, qMulherSim = 0, qHomem = 0, qHomemNao = 0;
        String sexo, resp;

        for (x = 1; x <= 15; x++) {  //repeticao para fazer a pesquisa com quinze pessoas
            System.out.print("Defina seu sexo 'Biológico'\nM - Masculino ou F - Feminino\nR:");
            sexo = input.next();
            if (sexo.equals("M") || sexo.equals("m")|| sexo.equals("F") || sexo.equals("f")) {  //veriicacao de sexo

                System.out.print("Você gostou do novo produto?\nS - Sim ou N - Não\nR:");
                resp = input.next();
                if (resp.equals("S") || resp.equals("s") || resp.equals("N") || resp.equals("n")) {  //verifica opniao do produto

                    if (sexo.equals("M") || sexo.equals("m")) {
                        qHomem += 1;
                    }

                    if (resp.equals("S") || resp.equals("s")) {
                        qSim += 1;
                        if (sexo.equals("F") || sexo.equals("f")) {
                            qMulherSim += 1;
                        }
                    }
                    if (resp.equals("N") || resp.equals("n")) {
                        qNao += 1;
                        if (sexo.equals("M") || sexo.equals("m")) {
                            qHomemNao += 1;
                        }
                    }
                }else{  // mensagem de erro
                    System.out.println("\n\n\nErro...\nTente novamente!\n\n\n");
                    // ( x--; ) serve para refazer a pesquisa correspondente
                    x--;
                }
            }else{  // mensagem de erro
                System.out.println("\n\n\nErro...\nTente novamente!\n\n\n");
                // ( x--; ) serve para refazer a pesquisa correspondente
                x--;
            }

        }

        System.out.println("O número de pessoas que responderam sim é "+qSim);
        System.out.println("O número de pessoas que responderam não é "+qNao);
        System.out.println("O número de mulheres que responderam sim é "+qMulherSim);
        System.out.println("O porcentagem de homens que responderam não é "+qHomemNao*100/qHomem+"%");

    }
}