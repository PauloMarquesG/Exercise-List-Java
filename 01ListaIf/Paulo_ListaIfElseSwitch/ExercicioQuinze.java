import java.util.Scanner;

public class ExercicioQuinze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int op,vlr,rend;
		
		System.out.print("       ::Menu de opções::");
		System.out.print("\n     Descrição | Rendimento Mensal");
		System.out.print("\n  1- Poupança  |          3%");
		System.out.print("\n  2- Renda fixa|          4%");
		System.out.print("\n\nQual opção deseja?\nR:");
		op = input.nextInt();
		
		if(op!=1 && op!=2) {
			System.out.print("\nErro... Opção inválida");
		}else {
			System.out.print("\nInsira o valor: R$");
			vlr = input.nextInt();
			
			if(op==1) {
				rend =/*vlr+*/ vlr*3/100;
				System.out.print("\nO rendimento mensal com a poupança é R$"+rend);
			}else if(op==2) {
				rend =/*vlr+*/ vlr*4/100;
				System.out.print("\nO rendimento mensal com renda fixa é R$"+rend);
			}
		}
	}

}
