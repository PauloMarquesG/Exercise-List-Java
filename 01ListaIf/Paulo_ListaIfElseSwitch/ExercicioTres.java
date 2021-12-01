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
			//número 1 maior que o número 2
			System.out.print("O maior número é o "+ num1);
		}else if(num2>num1){
			//número 2 maior que o número 1
			System.out.print("O maior número é o "+ num2);
		}else{
			//número 1 igual o número 2
			System.out.print("Os números são iguais!");
		}
		
	}

}
