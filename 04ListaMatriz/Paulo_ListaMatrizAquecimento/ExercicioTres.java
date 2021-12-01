import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lojas[] = new String[8];
        String produto[] = new String[4];
        double pre[][] = new double[4][8];
        int x, z;

        for (x = 0; x < 8; x++) {
            System.out.println("Digite o nome da " + (x + 1) + "º loja:");
            lojas[x] = input.next();
        }
        for (x = 0; x < 4; x++) {
            System.out.println("Digite o nome da " + (x + 1) + "º produto:");
            produto[x] = input.next();
        }
        for (x = 0; x < 4; x++) {
            for (z = 0; z < 8; z++) {
                System.out.println("Digite o preço do produto "+ produto[x]+" na loja "+ lojas[z]+":");
                pre[x][z] = input.nextDouble();
            }
        }
        for (x = 0; x < 4; x++) {
            for (z = 0; z < 8; z++) {
                if (pre[x][z]<120) {
                    System.out.println("Produto: "+ produto[x]+" Loja: "+lojas[z]);
                }

            }
        }

    }
}
