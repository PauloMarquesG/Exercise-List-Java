import java.util.Scanner;
import java.lang.Math;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fim,i,j,x,exp,numTermos,den=0,denominador,fat,s;

        System.out.println("Número de termos:");
        numTermos = input.nextInt();
        System.out.println("Valor para x:");
        x = input.nextInt();

        s=0;

        denominador = 1;

        for (i=1;i<= numTermos;i++){
            fim=denominador;
            fat=1;
            for (j=i;j<=fim;j++){
                fat = fat*j;
            }
            exp = i+1;
            if (exp%2==0){
                s -= Math.pow(x,exp)/fat;
            }else{
                s += Math.pow(x,exp)/fat;
            }
            if (denominador==4){
                den=-1;
            }
            if (denominador==1){
                den=1;
            }
            if (den==1){
                denominador = denominador+1;
            }else{
                denominador = denominador-1;
            }
        }
        System.out.println(s);
    }
}
