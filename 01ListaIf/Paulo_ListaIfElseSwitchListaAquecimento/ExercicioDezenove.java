import java.util.Scanner;
public class ExercicioDezenove {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		double alt,peso;
		
		System.out.print("Insira um valor para altura:");
		alt = input.nextDouble();
		System.out.print("Insira um valor para peso:");
		peso = input.nextDouble();
		
		if(alt<1.20){
			if(peso<=60){
				System.out.print("A");
			}else if(peso>60 && peso<=90){
				System.out.print("D");
			}else if(peso>90){
				System.out.print("G");
			}
		}else if(alt>=1.20 && alt<=1.70){
			if(peso<=60){
				System.out.print("B");
			}else if(peso>60 && peso<=90){
				System.out.print("E");
			}else if(peso>90){
				System.out.print("H");
			}
		}else if(alt>1.70){
			if(peso<=60){
				System.out.print("C");
			}else if(peso>60 && peso<=90){
				System.out.print("F");
			}else if(peso>90){
				System.out.print("I");
			}
		}
		
	}

}
