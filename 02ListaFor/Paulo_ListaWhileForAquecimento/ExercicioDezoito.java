import java.util.Scanner;
import java.lang.Math;

public class ExercicioDezoito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, linha=0;

        System.out.println("Para parar o programa digite um valor negativo ou 0!!");
        System.out.println("Insira quantos valores quiser:");
        do{
            linha++;//para somar mais uma linha

            num = input.nextInt();
            if (linha==1){//condicao para recomecar o cabecalho da tabela
                System.out.println("Valor Quadrado Cubo Raiz");
            }else if(linha==20){//condicao para zerar a quantidade de linhas
                linha=0;
            }
            if(num>0) {//condicao para formar a tabela com os dados
                System.out.println("  " + num + "      " + num * num + "     " + num * num * num + " " + Math.sqrt(num));
            }
        }while(num>0);//repeticao para o usuario colocar varios valores diferentes

        System.out.println("Fim progrma!");

    }
}
