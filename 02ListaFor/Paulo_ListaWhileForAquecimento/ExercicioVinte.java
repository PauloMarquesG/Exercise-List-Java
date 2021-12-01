import java.util.Scanner;

public class ExercicioVinte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cod, numHoras, salBru, salLiq = 0, mediaM = 0, mediaF = 0, contM = 0, contF = 0;
        String sexo;

        do {

            System.out.println("\n\nInsira seu código:");
            cod = input.nextInt();
            if (cod != 99999) {//condicao para confirmar se o valor do codigo eh valido
                System.out.println("Insira seu sexo:\nM - Masculino | F - Femenino");
                sexo = input.next();
                System.out.println("Insira quantas horas/aula dadas mensalmente:");
                numHoras = input.nextInt();
                salBru = numHoras * 30;
                if (sexo.equals("M") || sexo.equals("m")) {//condicao para saber se é professor
                    salLiq = salBru - (salBru * 10 / 100);
                    mediaM += salLiq;
                    contM++;
                } else if (sexo.equals("F") || sexo.equals("f")) {//condicao para saber se é professora
                    salLiq = salBru - (salBru * 5 / 100);
                    mediaF += salLiq;
                    contF++;
                }

                System.out.println("Seu código é " + cod + "\nSeu salário Bruto é " + salBru + "\nSeu salário líquido é " + salLiq);

            } else {//para parar o programa
                System.out.println("\n\nFim programa!!\n\n");
            }


        } while (cod != 99999);//repeticao para fazer a pesquisa varias vezes

        if (contM==0){//condicao para caso nao tenha professores do sexo masculino
            System.out.println("Nenhum professor do sexo masculino!");
        }else{//condicao apra saber a media dos salarios dos professores
            mediaM /= contM;
            System.out.println("A média do salário líquido masculino é R$"+ mediaM);
        }
        if (contF==0){//condicao para caso nao tenha professores do sexo feminino
            System.out.println("Nenhum professor do sexo feminino!");
        }else{//condicao apra saber a media dos salarios das professoras
            mediaF /= contF;
            System.out.println("A média do salário líquido feminino é R$"+ mediaF);
        }

    }
}
