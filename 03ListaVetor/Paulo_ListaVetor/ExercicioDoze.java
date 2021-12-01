import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String carro[] = new String[5];
        int qLitro[] = new int[5];
        int qQuilometro[] = new int[5];
        int x,z,aux;
        String aux2;

        for (x=0;x<5;x++){// repeticao para receber um valor
            System.out.println("Insira um modelo de carro:");
            carro[x] = input.next();
            System.out.println("Insira quantos Km ele faz em um litro:");
            qLitro[x] = input.nextInt();
        }

        for (x=0;x<5;x++){
            for (z=0;z<4;z++){
                if (qLitro[z]<qLitro[z+1]){
                    aux=qLitro[z];
                    qLitro[z]=qLitro[z+1];
                    qLitro[z+1]=aux;

                    aux2=carro[z];
                    carro[z]=carro[z+1];
                    carro[z+1]=aux2;
                }
            }
        }
        System.out.println("O modelo de carro mais econômico é o "+ carro[0]+", com "+qLitro[0]+"Km por L.");

        for (x=0;x<5;x++){
            qQuilometro[x]=1000/qLitro[x];
            System.out.println("O modelo de carro "+carro[x]+" em 1000Km precisa de "+qQuilometro[x]+"L");
        }



    }
}
