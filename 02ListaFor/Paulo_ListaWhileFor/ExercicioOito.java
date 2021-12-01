import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, idade, cond1 = 0, somaIdade = 0, mediaIdade = 0, cond3 = 0, cond4 = 0;
        double peso, altura;
        String corOlho, corCabelo;

        for (x = 1; x <= 20; x++) {  //repeticao para
            System.out.println("Qual a sua idade?");
            idade = input.nextInt();
            System.out.println("Qual o seu peso?");
            peso = input.nextDouble();
            System.out.println("Qual a sua altura?");
            altura = input.nextDouble();
            System.out.println("Qual a cor dos seus olhos?");
            System.out.println("A - Azul | P - Preto | V - Verde | C - Castanho");
            corOlho = input.next();
            if (corOlho.equals("A") || corOlho.equals("P") || corOlho.equals("V") || corOlho.equals("C")) {  //Verifica qual a cor do olho
                System.out.println("Qual a cor do seu cabelo?");
                System.out.println("P - Preto | C - Castanho | L - Loiro | R - Ruivo");
                corCabelo = input.next();

                if (corCabelo.equals("P")||corCabelo.equals("C")||corCabelo.equals("L")||corCabelo.equals("R")) {  //Verifica a cor do cabelo

                    if (idade > 50 && peso < 60) {
                        cond1 += 1;
                    }
                    if (altura < 1.50) {
                        somaIdade += idade;
                        mediaIdade += 1;
                    }
                    if (corOlho.equals("A")) {
                        cond3 += 1;
                    }
                    if (corCabelo.equals("R") && !corOlho.equals("A")) {
                        cond4 += 1;
                    }
                }else{  //Saida de erro
                    System.out.println("\n\n\n\n\n\nErro no código de cor do cabelo!\nTente novamente!");
                    //o x--; serve apenas para que essa pesquisa seja refeita
                    x--;
                }
            }else{  //Saida de erro
                System.out.println("\n\n\n\n\n\nErro no código de cor do olho!\nTente novamente!");
                //o x--; serve apenas para que essa pesquisa seja refeita
                x--;
            }

        }

        System.out.println("A quantidade de pessoas com idade superior a 50 anos e pso inferior a 60kg é " + cond1);
        System.out.println("A média das idades das pessoas com altura inferior a 1,50 m é " + (somaIdade / mediaIdade));
        System.out.println("A procentagem de pessoas com olhos azuis é " + cond3 * 100 / 20);
        System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis é " + cond4);

    }
}
