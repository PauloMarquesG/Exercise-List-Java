import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double vAnt, vNov;

        System.out.println("Digite o valor antigo do produto:");
        vAnt = input.nextDouble();
        System.out.println("Digite o novo valor do produto:");
        vNov = input.nextDouble();

        System.out.println("A porcentagem de acrescimo é: "+perc(vAnt,vNov)+"%");

    }
    public static double perc(double vAnt, double vNov){
        double dif;

        dif = vNov*100/vAnt;

        return dif-100;

    }
}
