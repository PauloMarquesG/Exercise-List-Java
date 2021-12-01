import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota[][] = new double[10][3];
        int x, z, n1, n2, n3, prov_menor;
        double menor;

        for (x = 0; x < 10; x++) {
            for (z = 0; z < 3; z++) {
                System.out.println("Digite a "+(z+1)+" nota do "+(x+1)+" aluno:");
                nota[x][z] = input.nextDouble();
            }
        }
        n1=0;
        n2=0;
        n3=0;
        for (x=0;x<10;x++){
            System.out.println("Aluno número "+(x+1));
            menor = nota[x][0];
            prov_menor = 0;
            for (z=0;z<3;z++){
                if (nota[x][z]<menor){
                    menor = nota[x][z];
                    prov_menor = z;
                }
            }
            System.out.println("A menor nota do aluno "+(x+1)+" foi na "+(prov_menor+1)+" prova");
            if (prov_menor==0){
                n1 +=1;
            }
            if (prov_menor==1){
                n2 +=1;
            }
            if (prov_menor==2){
                n3 +=1;
            }

        }
        System.out.println("Quantidade de alunos com menor nota na prova 1 : "+n1);
        System.out.println("Quantidade de alunos com menor nota na prova 2 : "+n2);
        System.out.println("Quantidade de alunos com menor nota na prova 3 : "+n3);

    }
}
