import java.util.Scanner; 
import java.lang.Math; 
public class ExercicioDezesete { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		
		double a,b,c,delta,x1,x2;
		
		System.out.print("Insira um valor para a:");
		a = input.nextDouble();
		System.out.print("Insira um valor para b:");
		b = input.nextDouble();
		System.out.print("Insira um valor para c:");
		c = input.nextDouble();
		
		if(a==0){
			System.out.print("Os valores inseridos não fazem parte de uma equação do segundo grau!");
		}else{
			delta = (b*b)-(4*a*c);
			if(delta<0){
				System.out.print("Não existe raiz real!");
			}else if(delta==0){
				System.out.print("Existe uma raiz real!");
				x1 = (-b)/(2*a);
				System.out.print("\nO valor de x1 é = "+ x1);
			}else if(delta>0){
				System.out.print("Existe duas raiz real!");
				x1= (-b+ Math.sqrt(delta))/(2*a);
				x2= (-b- Math.sqrt(delta))/(2*a);
				System.out.print("\nValor de x1 é = "+ x1 + "\nValor de x2 é = "+ x2);
			}
		}

	}

}
