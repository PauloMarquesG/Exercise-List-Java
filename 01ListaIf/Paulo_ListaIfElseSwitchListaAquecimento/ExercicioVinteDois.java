import java.util.Scanner;
public class ExercicioVinteDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int idade, peso;
		
		System.out.print("Insira sua idade:");
		idade = input.nextInt();
		System.out.print("Insira seu peso:");
		peso = input.nextInt();
		
		if(idade<20){
			if(peso<60){
				System.out.print("Risco n�vel 9");
			}else if(peso>=60 && peso<=90){
				System.out.print("Risco n�vel 8");
			}else if(peso>90){
				System.out.print("Risco n�vel 7");
			}
		}else if(idade>=20 && idade<=50){
			if(peso<60){
				System.out.print("Risco n�vel 6");
			}else if(peso>=60 && peso<=90){
				System.out.print("Risco n�vel 5");
			}else if(peso>90){
				System.out.print("Risco n�vel 4");
			}
		}else if(idade>50){
			if(peso<60){
				System.out.print("Risco n�vel 3");
			}else if(peso>=60 && peso<=90){
				System.out.print("Risco n�vel 2");
			}else if(peso>90){
				System.out.print("Risco n�vel 1");
			}
		}
		
	}

}
