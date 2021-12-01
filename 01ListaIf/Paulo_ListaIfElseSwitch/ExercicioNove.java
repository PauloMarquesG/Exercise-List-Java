import java.util.Scanner;
public class ExercicioNove {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sal,percCred;
		
		System.out.print("Insira o valor do seu salário: R$");
		sal = input.nextInt();
		
		if(sal>400){
			//calculo de aumento
			percCred = sal+sal*30/100;
			System.out.print("Seu saldo médio é R$"+ sal +"\nO valor do crédito é R$"+ percCred);
		}else if(sal<=400 && sal>300){
			//calculo de aumento
			percCred = sal+sal*25/100;
			System.out.print("Seu saldo médio é R$"+ sal +"\nO valor do crédito é R$"+ percCred);
		}else if(sal<=300 && sal>200){
			//calculo de aumento
			percCred = sal+sal*20/100;
			System.out.print("Seu saldo médio é R$"+ sal +"\nO valor do crédito é R$"+ percCred);
		}else if(sal<=200){
			//calculo de aumento
			percCred = sal+sal*10/100;
			System.out.print("Seu saldo médio é R$"+ sal +"\nO valor do crédito é R$"+ percCred);
		}
		
	}

}
