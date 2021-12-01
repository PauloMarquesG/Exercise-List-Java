import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nt1,nt2,nt3;
        String letra;

        System.out.println("Insira a nota1:");
        nt1 = input.nextInt();
        System.out.println("Insira a nota2:");
        nt2 = input.nextInt();
        System.out.println("Insira a nota3:");
        nt3 = input.nextInt();
        do {
            System.out.println("\nInsira uma letra:\nA - média aritimética\nP - média ponderada");
            letra = input.next();
        }while(!letra.equals("A") && !letra.equals("P"));

        media(nt1,nt2,nt3,letra);

    }
    public static void media(int nt1,int nt2,int nt3,String letra){
        if (letra.equals("A")){
            System.out.println("\nA média  aritimética é: "+ (nt1+nt2+nt3)/3);
        }else{
            System.out.println("\nA média  ponderada é: "+ ((nt1*5)+(nt2*3)+(nt3*2))/(5+3+2));
        }
    }
}
