import java.util.Scanner;
public class ExercicioSete {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sal,aum;
		
		System.out.print("Digite seu salário:");
		sal = input.nextInt();
		
		if(sal<=500){
			System.out.print("Você vai receber uma aumento de 30%!");
			//calculo de aumento
			aum = sal+sal*30/100;
			System.out.print("Seu novo salário é R$"+ aum);
		}else{
			System.out.print("Seu salário é maior que R$500,00, você não recebe aumento!!");
		}
		
		
	
	}

}
