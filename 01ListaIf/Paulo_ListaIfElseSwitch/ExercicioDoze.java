import  java.util.Scanner;
public class ExercicioDoze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sal,vlrRec;
		
		System.out.print("Insira o valor do seu salário: R$");
		sal = input.nextInt();
		
		//Verificação de salário
		if(sal<=350) {
			vlrRec = sal-sal*7/100+100;
			System.out.print("O valor a ser recebido é R$"+ vlrRec);
		}else if(sal>300 && sal<=600) {
			vlrRec = sal-sal*7/100+75;
			System.out.print("O valor a ser recebido é R$"+ vlrRec);
		}else if(sal>600 && sal<=900) {
			vlrRec = sal-sal*7/100+50;
			System.out.print("O valor a ser recebido é R$"+ vlrRec);
		}else if(sal>900) {
			vlrRec = sal-sal*7/100+35;
			System.out.print("O valor a ser recebido é R$"+ vlrRec);
		}
	}

}
