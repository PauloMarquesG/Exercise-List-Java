import java.util.Scanner;
public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1,num2,num3;
		
		System.out.print("Insira um n�mero: ");
		num1 = input.nextInt();
		System.out.print("Insira um n�mero: ");
		num2 = input.nextInt();
		System.out.print("Insira um n�mero: ");
		num3 = input.nextInt();
		
		if(num1<num2 && num1<num3){
			if(num2<num3){
				System.out.print("A ordem crescente �: "+ num1 +", "+ num2 +" e "+ num3);
			}else{
				System.out.print("A ordem crescente �: "+ num1 +", "+ num3 +" e "+ num2);
			}
		}
		if(num2<num1 && num2<num3){
			if(num1<num3){
				System.out.print("A ordem crescente �: "+ num2 +", "+ num1 +" e "+ num3);
			}else{
				System.out.print("A ordem crescente �: "+ num2 +", "+ num3 +" e "+ num1);
			}
		}
		if(num3<num2 && num3<num1){
			if(num1<num2){
				System.out.print("A ordem crescente �: "+ num3 +", "+ num1 +" e "+ num2);
			}else{
				System.out.print("A ordem crescente �: "+ num3 +", "+ num2 +" e "+ num1);
			}
		}
		
	}

}
