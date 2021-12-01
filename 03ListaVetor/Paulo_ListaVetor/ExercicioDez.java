import java.util.Scanner;
import java.util.Random;
/*
Essa biblioteca cria valores aleatorios, dentro de uma parametro pre definido pelo programador
*/

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerar = new Random();

        int aluno[][] = new int[10][9];
        int gabarito[] = new int[8];
        int x, y, porc = 0;

        for (x = 0; x < 8; x++) {// repeticao para criar o gabarito
            gabarito[x] = gerar.nextInt(3);
        }
        /* o valor dentro do parenteses serve
        para definir um valor maximo, ou seja,
        nessa condicao ele vai de 0 a 3*/

        for (x = 0; x < 10; x++) {// repeticao para receber os gabaritos de cada alunos
            System.out.println("Entre com o gabarito do " + (x + 1) + "º aluno::\nAlternativas de 0, 1 ou 2");
            for (y = 0; y < 8; y++) {// repeticao para receber o gabarito do aluno
                aluno[x][y] = input.nextInt();
            }
        }

        for (x = 0; x < 10; x++) {// repeticao para dar nota ao aluno
            for (y = 0; y < 8; y++) {
                if (aluno[x][y] == gabarito[y]) {
                    aluno[x][8]+=1;
                }
            }
            if (aluno[x][8] >= 6) {
                porc += 10;
            }
        }

        for (x = 0; x < 10; x++) {// repeticao para mostrar as notas dos alunos
            System.out.println("O aluno " + (x+1) + " conseguiu a nota: " + aluno[x][8]);
        }
        System.out.println("A percentagem de aprovação é: " + porc + "%");

    }
}