import java.util.Scanner;
public class ExercicioQuatorze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sal, salNovo;
		
		System.out.print("Insira o valor do salário: R$");
		sal = input.nextInt();
		
		if(sal<=300) {
			salNovo = sal+sal*50/100;
			System.out.print("O novo salário é de R$"+ salNovo);
		}else if(sal>300 && sal<=500) {
			salNovo = sal+sal*40/100;
			System.out.print("O novo salário é de R$"+ salNovo);
		}else if(sal>500 && sal<=700) {
			salNovo = sal+sal*30/100;
			System.out.print("O novo salário é de R$"+ salNovo);
		}else if(sal>700 && sal<=800) {
			salNovo = sal+sal*20/100;
			System.out.print("O novo salário é de R$"+ salNovo);
		}else if(sal>800 && sal<=1000) {
			salNovo = sal+sal*10/100;
			System.out.print("O novo salário é de R$"+ salNovo);
		}else if(sal>1000) {
			salNovo = sal+sal*5/100;
			System.out.print("O novo salário é de R$"+ salNovo);
		}
	}

}
