import java.util.Scanner;
public class ExercicioTreze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int prod,precFinal;
		
		System.out.print("Insira o valor do produto: R$");
		prod = input.nextInt();
		
		//Verifica o valor inicial do produto
		if(prod<50) {
			precFinal = prod+prod*5/100;
			if(precFinal<80) {
				
				//Classifica como Barato
				System.out.print("O valor do produto é R$"+ precFinal +"\nA classificação dele é Barato!");
				
			}
			
		}else if(prod>=50 && prod<=100) {
			precFinal = prod+prod*10/100;
			if(precFinal<80) {
				
				//Classifica como Barato
				System.out.print("O valor do produto é R$"+ precFinal +"\nA classificação dele é Barato!");
				
			}else if(precFinal>=80 && precFinal<=120) {
				
				//Classifica como Normal
				System.out.print("O valor do produto é R$"+ precFinal +"\nA classificação dele é Normal!");
				
			}
			
		}else if(prod>100) {
			precFinal = prod+prod*15/100;
			if(precFinal>=80 && precFinal<=120) {
				
				//Classifica como Normal
				System.out.print("O valor do produto é R$"+ precFinal +"\nA classificação dele é Normal!");
				
			}else if(precFinal>120 && precFinal<=200) {
				
				//Classifica como Caro
				System.out.print("O valor do produto é R$"+ precFinal +"\nA classificação dele é Caro!");
				
			}else if(precFinal>200) {
				
				//Classifica como Muito caro
				System.out.print("O valor do produto é R$"+ precFinal +"\nA classificação dele é Muito caro!");
				
			}
			
		}
		
	}
	
}