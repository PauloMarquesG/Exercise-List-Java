import java.util.Scanner;

public class ExercicioDezenove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n;

        do {
            System.out.println("Insira um valor para m:");
            m = input.nextInt();
            System.out.println("Insira um valor para n:");
            n = input.nextInt();
            if (m<n){//condicao para ver se m eh menor que n
                System.out.println("A soma de m:"+ m+" e n:"+n+" é igual a =>"+(m+n));
            }else if (m>n){//condicao para ver se n eh menor que m e o fim do programa
                System.out.println("Fim programa!!");
            }
        }while(m<n);

    }
}
