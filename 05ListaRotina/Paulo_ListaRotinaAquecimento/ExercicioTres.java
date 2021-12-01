import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c, res;
        
        do {
            System.out.println("Insira um valor para 'a' maior que 1:");
            a = input.nextInt();
        }while(a<1);

        System.out.println("Insira um valor para 'b':");
        b = input.nextInt();
        System.out.println("Insira um valor para 'b':");
        c = input.nextInt();
        
        res = div(a,b,c);

        System.out.println("Soma dos inteiros = "+ res);

    }
    
    public static Integer div(int a, int b, int c){
        int x,s = 0,r;
        for (x=b;x<c;x++){
            r = (x%a);
            if (r==0){
                s+=x;
            }
        }
        return s;
    }
    
}
