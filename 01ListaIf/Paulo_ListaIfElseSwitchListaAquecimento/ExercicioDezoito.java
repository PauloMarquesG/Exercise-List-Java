import java.util.Scanner;
public class ExercicioDezoito { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int x,y,z;
		
		System.out.print("Insira um valor para x:");
		x = input.nextInt();
		System.out.print("Insira um valor para y:");
		y = input.nextInt();
		System.out.print("Insira um valor para z:");
		z = input.nextInt();
		
		if(x<y+z && y<x+z && z<y+x){
			if(x==y && y==z){
				System.out.print("Triângulo Equilátero");
			}else if(x==y || x==z || y==z){
				System.out.print("Triângulo Isóceles");
			}else if(x!=y && x!=z && y!=z){
				System.out.print("Triângulo Escaleno");
			}
		}else{
			System.out.print("Essas medidas não formam um triângulo");;
		}
		
	}

}
