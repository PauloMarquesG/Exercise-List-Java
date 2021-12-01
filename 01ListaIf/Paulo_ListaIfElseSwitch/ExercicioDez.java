import java.util.Scanner;
public class ExercicioDez {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vlrCarro, porcDis, porImp, vlrFinal;
		
		System.out.print("Qual o custo da fábrica: R$");
		vlrCarro = input.nextInt();
		
		//Verifica o valor do carro
		if(vlrCarro<12000){
			vlrFinal = vlrCarro+vlrCarro*5/100;
			System.out.print("O valor para o consumidor do carro é: R$"+vlrFinal);
		}else if(vlrCarro>=12000 && vlrCarro<=25000){
			vlrFinal = vlrCarro+vlrCarro*10/100+vlrCarro*15/100;
			System.out.print("O valor para o consumidor do carro é: R$"+vlrFinal);
		}else if(vlrCarro>25000){
			vlrFinal = vlrCarro+vlrCarro*15/100+vlrCarro*20/100;
			System.out.print("O valor para o consumidor do carro é: R$"+vlrFinal);
		}
		
	}

}
