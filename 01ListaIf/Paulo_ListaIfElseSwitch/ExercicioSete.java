import java.util.Scanner;
public class ExercicioSete {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sal,aum;
		
		System.out.print("Digite seu sal�rio:");
		sal = input.nextInt();
		
		if(sal<=500){
			System.out.print("Voc� vai receber uma aumento de 30%!");
			//calculo de aumento
			aum = sal+sal*30/100;
			System.out.print("Seu novo sal�rio � R$"+ aum);
		}else{
			System.out.print("Seu sal�rio � maior que R$500,00, voc� n�o recebe aumento!!");
		}
		
		
	
	}

}
