import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String mes[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
                "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro",};
        int temp[] = new int[12];
        int x,z,aux;
        String aux2;

        for (x=0;x<12;x++){// repeticao para receber um valor
            System.out.println("Insira a temperatura média de "+ mes[x]+":");
            temp[x] = input.nextInt();
        }

        for (x=0;x<=12;x++){
            for (z=0;z<11;z++){
                if (temp[z]<temp[z+1]){
                    // temperatura
                    aux=temp[z];
                    temp[z]=temp[z+1];
                    temp[z+1]=aux;
                    // mes
                    aux2=mes[z];
                    mes[z]=mes[z+1];
                    mes[z+1]=aux2;
                }
            }
        }

        System.out.println("Mês com maior temperatura:"+mes[0]+" "+temp[0]);
        System.out.println("Mês com menor temperatura:"+mes[11]+" "+temp[11]);

    }
}
