import java.util.Scanner;

public class ExercicioQuinze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int op,vlr,rend;
		
		System.out.print("       ::Menu de op��es::");
		System.out.print("\n     Descri��o | Rendimento Mensal");
		System.out.print("\n  1- Poupan�a  |          3%");
		System.out.print("\n  2- Renda fixa|          4%");
		System.out.print("\n\nQual op��o deseja?\nR:");
		op = input.nextInt();
		
		if(op!=1 && op!=2) {
			System.out.print("\nErro... Op��o inv�lida");
		}else {
			System.out.print("\nInsira o valor: R$");
			vlr = input.nextInt();
			
			if(op==1) {
				rend =/*vlr+*/ vlr*3/100;
				System.out.print("\nO rendimento mensal com a poupan�a � R$"+rend);
			}else if(op==2) {
				rend =/*vlr+*/ vlr*4/100;
				System.out.print("\nO rendimento mensal com renda fixa � R$"+rend);
			}
		}
	}

}
