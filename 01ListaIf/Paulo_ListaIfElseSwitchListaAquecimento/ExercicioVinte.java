import java.util.Scanner;
public class ExercicioVinte {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double peso_quilos, peso_gramas, pre_total,prec_grama=0, imp=0, valor_total;
		int cod_prod,cod_pais;
		
		System.out.print("Insira o código do produto:");
		cod_prod = input.nextInt();
		System.out.print("Insira peso em quilos (KG):");
		peso_quilos = input.nextDouble();
		System.out.print("Insira o código do país:");
		cod_pais = input.nextInt();
		
		peso_gramas = peso_quilos*1000;
		
		System.out.print("\nO peso em gramas é "+ peso_gramas +"g");
		
		if(cod_prod>=1 && cod_prod<=4){
			prec_grama = 10;
		}else if(cod_prod>=5 && cod_prod<=7){
			prec_grama = 25;
		}else if(cod_prod>=8 && cod_prod<=10){
			prec_grama = 35;
		}
		
		pre_total = peso_gramas * prec_grama;
				
		System.out.print("\nO preço em gramas é R$"+ prec_grama +",00");
		
		if(cod_pais == 1){
			imp = 0;
		}else if(cod_pais == 2){
			imp = pre_total*15/100;
		}else if(cod_pais ==3){
			imp = pre_total*25/100;
		}
		
		valor_total = pre_total+imp;
		
		System.out.print("\nO valor total é R$"+ valor_total +",00");
		
	}

}
