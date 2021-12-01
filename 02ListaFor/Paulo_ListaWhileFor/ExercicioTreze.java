import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, idade, peso, faixa1 = 0, mf1 = 0, faixa2 = 0, mf2 = 0, faixa3 = 0, mf3 = 0, faixa4 = 0, mf4 = 0;

        for (x=1;x<=15;x++){  //repeticao para fazer a pesquisa com quinze pessoas
            System.out.println("Qual a sua idade?");
            idade = input.nextInt();
            System.out.println("Qual o seu peso?");
            peso = input.nextInt();

            if (idade>=1 && idade <=10){
                faixa1 += 1;
                mf1 += peso;
            }else if (idade>=11 && idade <=20){
                faixa2 += 1;
                mf2 += peso;
            }else if(idade>=21 && idade <=30){
                faixa3 += 1;
                mf3 += peso;
            }else if(idade>=31){
                faixa4 += 1;
                mf4 += peso;
            }

        }

        System.out.println("A média de pessoas na 1º faixa etária é "+ (mf1/faixa1));
        System.out.println("A média de pessoas na 2º faixa etária é "+ (mf2/faixa2));
        System.out.println("A média de pessoas na 3º faixa etária é "+ (mf3/faixa3));
        System.out.println("A média de pessoas na 4º faixa etária é "+ (mf4/faixa4));

    }
}
