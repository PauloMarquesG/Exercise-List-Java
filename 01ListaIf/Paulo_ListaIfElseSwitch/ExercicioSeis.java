import java.util.Scanner;
import java.lang.Math;
public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1,num2,op;
		double res,sqrt1,sqrt2,cbrt1,cbrt2;
		
		System.out.print("          ::Menu de op��es::");
		System.out.print("\n  1� n�mero elevado ao 2� n�mero - digite 1");
		System.out.print("\n  Raiz quadrada de cada n�mero   - digite 2");
		System.out.print("\n  Raiz c�bica de cada n�mero     - digite 3");
		System.out.print("\n\nDigite a op��o escolhida:");
		op = input.nextInt();
		
		if(op!=1 && op!=2 && op!=3){
			System.out.print("\nValor inserido � invalido, olhe o menu na proxima vez!\nFim do programa");
		}
		if(op==1){
			
			//primeiro valor
			System.out.print("\nDigite o 1� n�mero:");
			num1 = input.nextInt();
			
			//segundo valor
			System.out.print("\nDigite o 2� n�mero:");
			num2 = input.nextInt();
			
			//resultado
			res= Math.pow(num1, num2);
			
			//apresenta��o
			System.out.print("\n\nO "+ num1 +" elevado a "+ num2 + " �: "+ res);
			
		}else if(op==2){
	
			//primeiro valor
			System.out.print("\nDigite o 1� n�mero:");
			num1 = input.nextInt();
			
			//segundo valor
			System.out.print("\nDigite o 2� n�mero:");
			num2 = input.nextInt();
			
			//resultado
			sqrt1= Math.sqrt(num1);
			sqrt2= Math.sqrt(num2);
			
			//apresenta��o
			System.out.print("\n\nA raiz de "+ num1 +" �: "+ sqrt1 +"\nA raiz de "+ num2 +" �: "+ sqrt2);
			
		}else if(op==3){
			
			//primeiro valor
			System.out.print("\nDigite o 1� n�mero:");
			num1 = input.nextInt();
					
			//segundo valor
			System.out.print("\nDigite o 2� n�mero:");
			num2 = input.nextInt();
					
			//resultado
			cbrt1= Math.cbrt(num1);
			cbrt2= Math.cbrt(num2);
					
			//apresenta��o
			System.out.print("\n\nA raiz c�bica de "+ num1 +" �: "+ cbrt1 +"\nA raiz c�bica de "+ num2 +" �: "+ cbrt2);
			
		}
	
	}

}
