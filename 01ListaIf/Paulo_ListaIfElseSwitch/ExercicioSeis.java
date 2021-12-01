import java.util.Scanner;
import java.lang.Math;
public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1,num2,op;
		double res,sqrt1,sqrt2,cbrt1,cbrt2;
		
		System.out.print("          ::Menu de opções::");
		System.out.print("\n  1º número elevado ao 2º número - digite 1");
		System.out.print("\n  Raiz quadrada de cada número   - digite 2");
		System.out.print("\n  Raiz cúbica de cada número     - digite 3");
		System.out.print("\n\nDigite a opção escolhida:");
		op = input.nextInt();
		
		if(op!=1 && op!=2 && op!=3){
			System.out.print("\nValor inserido é invalido, olhe o menu na proxima vez!\nFim do programa");
		}
		if(op==1){
			
			//primeiro valor
			System.out.print("\nDigite o 1º número:");
			num1 = input.nextInt();
			
			//segundo valor
			System.out.print("\nDigite o 2º número:");
			num2 = input.nextInt();
			
			//resultado
			res= Math.pow(num1, num2);
			
			//apresentação
			System.out.print("\n\nO "+ num1 +" elevado a "+ num2 + " é: "+ res);
			
		}else if(op==2){
	
			//primeiro valor
			System.out.print("\nDigite o 1º número:");
			num1 = input.nextInt();
			
			//segundo valor
			System.out.print("\nDigite o 2º número:");
			num2 = input.nextInt();
			
			//resultado
			sqrt1= Math.sqrt(num1);
			sqrt2= Math.sqrt(num2);
			
			//apresentação
			System.out.print("\n\nA raiz de "+ num1 +" é: "+ sqrt1 +"\nA raiz de "+ num2 +" é: "+ sqrt2);
			
		}else if(op==3){
			
			//primeiro valor
			System.out.print("\nDigite o 1º número:");
			num1 = input.nextInt();
					
			//segundo valor
			System.out.print("\nDigite o 2º número:");
			num2 = input.nextInt();
					
			//resultado
			cbrt1= Math.cbrt(num1);
			cbrt2= Math.cbrt(num2);
					
			//apresentação
			System.out.print("\n\nA raiz cúbica de "+ num1 +" é: "+ cbrt1 +"\nA raiz cúbica de "+ num2 +" é: "+ cbrt2);
			
		}
	
	}

}
