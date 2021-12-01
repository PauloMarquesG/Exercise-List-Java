import java.util.Scanner;
public class ExercicioDezeseis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double pre, venda, novo_pre=0;
		
		System.out.print("Insira o valor do preço atual:");
		pre = input.nextDouble();
		System.out.print("Insira o valor da venda média:");
		venda = input.nextDouble();
		
		if(venda<500 || pre<30){
			System.out.print("Aumento de 10%");
			novo_pre = pre+pre*10/100;
		}else if((venda>=500 && venda<1200)||(pre>=30 && pre<80)){
			System.out.print("Aumento de 15%");
			novo_pre = pre+pre*15/100;
		}else if(venda>=1200 || pre>=80){
			System.out.print("Diminuição de 20%");
			novo_pre = pre+pre*20/100;
		}
		
		System.out.print("O novo preço é R$"+ novo_pre);
		
	}

}
