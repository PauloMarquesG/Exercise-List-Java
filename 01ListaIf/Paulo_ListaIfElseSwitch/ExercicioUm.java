import java.util.Scanner;
public class ExercicioUm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int nota1,nota2,nota3,media;
		
		System.out.println("Insira a 1� nota:");
		nota1 = input.nextInt();
		System.out.println("Insira a 2� nota:");
		nota2 = input.nextInt();
		System.out.println("Insira a 3� nota:");
		nota3 = input.nextInt();
		
		//m�dia das notas
		media = (nota1*2+nota2*3+nota3*5)/(2+3+5);
	
		if(media>=0 && media<5){
			//Caso notas E
			System.out.print("Sua nota � "+ media + ", conceito E");
		}else if(media>=5 && media<6){
			//Caso notas D
			System.out.print("Sua nota � "+ media + ", conceito D");
		}else if(media>=6 && media<7){
			//Caso notas C
			System.out.print("Sua nota � "+ media + ", conceito C");
		}else if(media>=7 && media<8){
			//Caso notas B
			System.out.print("Sua nota � "+ media + ", conceito B");
		}else if(media>=8 && media<=10){
			//Caso notas A
			System.out.print("Sua nota � "+ media + ", conceito A");
		}else{
			//Caso notas n�o sejam validas
			System.out.print("Erro no programa...");
		}
		
	}
}
