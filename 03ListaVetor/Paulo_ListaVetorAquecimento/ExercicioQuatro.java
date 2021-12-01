import java.util.Scanner;

public class ExercicioQuatro {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int num[] = new int[8];
            int pos[] = new int[8];
            int neg[] = new int[8];
            int x,cont1=0,cont2=0;

            for (x=0;x<8;x++){// repeticao para receber os valores
                System.out.println("Insira um valor:");
                num[x] =input.nextInt();
                if (num[x]>=0){// condicao para saber se eh positivo
                    pos[cont1]=num[x];
                    cont1++;
                }else{// condicao para saber se eh negativo
                    neg[cont2]=num[x];
                    cont2++;
                }
            }
            if (cont1>=1){// condicao para mostrar os positivos
                System.out.println("::Vetor com valores positivos::");
                for (x=0;x<cont1;x++){
                    System.out.println(pos[x]);
                }
            }
            if (cont2>=1){// condicao para mostrar os negativos
                System.out.println("::Vetor com valores negativos::");
                for (x=0;x<cont2;x++){
                    System.out.println(neg[x]);
                }
            }

        }
}
