import java.util.Scanner;
public class ExercicioOnze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sal,aum,salFinal;
		
		System.out.print("Insira o valor do seu sal�rio: R$");
		sal = input.nextInt();
		
		//Verifica se o sal�rio � menor ou igual a 300
		if(sal<=300){
			aum=sal*15/100;
			salFinal=sal+aum;
			System.out.print("O valor do aumento � R$"+ aum +"\nNovo sal�rio � R$"+ salFinal);
		}
		
	}

}
