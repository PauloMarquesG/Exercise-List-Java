import java.util.Scanner;
public class ExercicioTres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1,num2;
		
		System.out.print("Insira um valor: ");
		num1 = input.nextInt();
		System.out.print("Insira um valor: ");
		num2 = input.nextInt();
		
		if(num1>num2){
			//n�mero 1 maior que o n�mero 2
			System.out.print("O maior n�mero � o "+ num1);
		}else if(num2>num1){
			//n�mero 2 maior que o n�mero 1
			System.out.print("O maior n�mero � o "+ num2);
		}else{
			//n�mero 1 igual o n�mero 2
			System.out.print("Os n�meros s�o iguais!");
		}
		
	}

}
