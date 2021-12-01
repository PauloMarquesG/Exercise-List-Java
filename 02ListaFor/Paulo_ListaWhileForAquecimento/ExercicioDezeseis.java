import java.util.Scanner;

public class ExercicioDezeseis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base=0, altura = 0, x=0;

        do {
            x++;
            if(x>1){//condicao para o programa recomecar
                System.out.println("\n\nTente novamente, com valores diferentes!!");
            }
            System.out.println("Insira o valor da Base:");
            base = input.nextInt();
            System.out.println("Insira o valor da Altura:");
            altura = input.nextInt();
        }while(base==0 || altura==0);//repeticao para fazer a area do triangulo varias vezes caso o usuario coloque um valor invalido

        System.out.println("A área do triângulo é: " + ((base*altura)/2));

    }
}
