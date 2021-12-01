import java.util.Scanner;

public class ExercicioDezenove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vetor1[] = new String[20];
        String vetor2[] = new String[20];
        String aux;
        int x,z;

        for (x=0;x<20;x++){// repeticao para receber um valor
            System.out.println("Insira um valor para o primeiro vetor:");
            vetor1[x] = input.next();
        }
        for (x=0;x<20;x++){// repeticao para receber um valor
            System.out.println("Insira um valor para o segundo vetor:");
            vetor2[x] = input.next();
        }

        for (x=0;x<20;x++){// repeticao para inverter os valores
            aux=vetor1[x];
            vetor1[x]=vetor2[19-x];
            vetor2[19-x]=aux;
        }

       for (x=0;x<20;x++){// repeticao para mostrar os valores
            System.out.print(vetor1[x]);
        }
        System.out.println("");
        for (x=0;x<20;x++){// repeticao para mostrar os valores
            System.out.print(vetor2[x]);
        }

    }
}
