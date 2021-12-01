import java.util.Scanner;
public class ExercicioVinteUm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cod_ori, prec;
		
		System.out.print("Insira o código de origem:");
		cod_ori = input.nextInt();
		System.out.print("Insira preço do produto:");
		prec = input.nextInt();
		
		if(cod_ori==1){
			System.out.print("Sul");
		}else if(cod_ori==2){
			System.out.print("Norte");
		}else if(cod_ori==3){
			System.out.print("Leste");
		}else if(cod_ori==4){
			System.out.print("Oeste");
		}else if(cod_ori==5 || cod_ori==6){
			System.out.print("Nordeste");
		}else if(cod_ori==7 || cod_ori==8 || cod_ori==9){
			System.out.print("Sudeste");
		}else if(cod_ori>=10 && cod_ori<=20){
			System.out.print("Centro_Oeste");
		}else if(cod_ori>=21 && cod_ori<=30){
			System.out.print("Nordeste");
		}
		
	}

}
