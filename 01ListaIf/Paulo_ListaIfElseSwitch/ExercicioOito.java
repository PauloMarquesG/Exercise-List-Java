import java.util.Scanner;
public class ExercicioOito {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sal,aum;
		
		System.out.print("Digite seu sal�rio:");
		sal = input.nextInt();
		
		if(sal<=300){
			System.out.print("Voc� vai receber uma aumento de 35%!");
			//calculo de aumento
			aum = sal+sal*35/100;
			System.out.print("Seu novo sal�rio � R$"+ aum);
		}else if(sal>300){
			System.out.print("Voc� vai receber uma aumento de 15%!");
			//calculo de aumento
			aum = sal+sal*15/100;
			System.out.print("Seu novo sal�rio � R$"+ aum);
		}
		
	}

}
