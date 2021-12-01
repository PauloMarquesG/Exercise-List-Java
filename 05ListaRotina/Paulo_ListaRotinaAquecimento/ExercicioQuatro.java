import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seg;

        System.out.println("Insira um tempo em segundos::");
        seg = input.nextInt();

        mudaTemp(seg);

    }
    public static void mudaTemp(int seg){
        int h,m,s,r;

        h = seg/3600;
        r = seg%3600;
        m = r/60;
        s = r%60;

       System.out.println("Horas: "+h+"\nMinutos:"+m+"\nSegundos:"+s);
       return;
    }
}
