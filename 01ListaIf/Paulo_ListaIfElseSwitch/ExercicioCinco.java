import java.util.Scanner;
public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1,num2,num3,num4;
		
		System.out.print("Insira valores em ordem decrescente!\n\n");
		System.out.print("Insira um n�mero: ");
		num1 = input.nextInt();
		System.out.print("Insira um n�mero: ");
		num2 = input.nextInt();
		System.out.print("Insira um n�mero: ");
		num3 = input.nextInt();
		System.out.print("Insira um n�mero fora de ordem: ");
		num4 = input.nextInt();
		
		if(num4>num3){
			System.out.print("A ordem decrescente �: "+ num4 +", "+ num3 +", "+ num2 +" e "+ num1);
		}
		if(num4>num2 && num4<num3){
			System.out.print("A ordem decrescente �: "+ num3 +", "+ num4 +", "+ num2 +" e "+ num1);			
		}
		if(num4>num1 && num4<num2){
			System.out.print("A ordem decrescente �: "+ num3 +", "+ num2 +", "+ num4 +" e "+ num1);			
		}
		if(num4<num1){
			System.out.print("A ordem decrescente �: "+ num3 +", "+ num2 +", "+ num1 +" e "+ num4);			
		}
		
	}

}
