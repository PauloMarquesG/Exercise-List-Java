import java.util.Scanner;
public class ExercicioDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nota1,nota2,nota3,media,rest;
		
		System.out.println("Insira a 1º nota:");
		nota1 = input.nextInt();
		System.out.println("Insira a 2º nota:");
		nota2 = input.nextInt();
		System.out.println("Insira a 3º nota:");
		nota3 = input.nextInt();
		
		//média das notas
		media= (nota1+nota2+nota3)/3;
		
		if(media>=0 && media<3){
			//Reprovado
			System.out.print("Sua nota é "+ media + ", Reprovado!");
		}else if(media>=3 && media<7){
			//Exame
			System.out.print("Sua nota é "+ media + ", Exame!");
			rest=6-media;
			System.out.print("\nVocê precisa de "+ rest +" para ser aprovado!");
		}else if(media>=7 && media<=10){
			//Aprovado
			System.out.print("Sua nota é "+ media + ", Aprovado!");
		}else{
			//Caso notas não sejam validas
			System.out.print("Erro no programa...");
		}
		
	}

}
