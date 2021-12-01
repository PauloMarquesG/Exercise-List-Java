import java.util.Scanner;
public class ExercicioOnze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sal,aum,salFinal;
		
		System.out.print("Insira o valor do seu salário: R$");
		sal = input.nextInt();
		
		//Verifica se o salário é menor ou igual a 300
		if(sal<=300){
			aum=sal*15/100;
			salFinal=sal+aum;
			System.out.print("O valor do aumento é R$"+ aum +"\nNovo salário é R$"+ salFinal);
		}
		
	}

}
