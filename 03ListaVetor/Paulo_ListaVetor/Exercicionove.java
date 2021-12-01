import java.util.Scanner;
import java.lang.Math;

public class Exercicionove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double aviao[] = new double[12];
        double assentos[] = new double[12];
        String[] origem = {"Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais"};
        String[] destino = {"Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Maranhão", "Sergipe", "Santa Catarina", "São Paulo"};
        Integer x,op1=0,op2=0,passagem;
        boolean verifica = false;

        for (x = 0; x <= 11; x++) {
            aviao[x] = Math.floor(Math.random()*1000);
            assentos[x] = 156;
        }

        do{
            System.out.println("\n\n::Menu de opções::\n1 - Consultar\n2 - Efetuar Reserva\n3 - Sair");
            op1 = input.nextInt();
            if (op1==1||op1==2||op1==3) {
                if (op1 == 1) {
                    System.out.println("\n\n::Menu de opções::\n1 - Número do vôo\n2 - Origem\n3 - Destino");
                    op2 = input.nextInt();
                    if (op2 == 1) {
                        System.out.println("\n\nNúmero dos vôos::\nAvião | Código");
                        for (x = 0; x < 12; x++) {
                            System.out.println((x + 1) + " | " + Math.round(aviao[x]));
                        }
                    } else if (op2 == 2) {
                        System.out.println("\n\n::Avião - Origem::");
                        for (x = 0; x < 12; x++) {
                            System.out.println((x + 1) + " - " + origem[x]);
                        }
                    } else if (op2 == 3) {
                        System.out.println("\n\n::Avião - Destino::");
                        for (x = 0; x < 12; x++) {
                            System.out.println((x + 1) + " - " + destino[x]);
                        }
                    }
                } else if (op1 == 2) {
                    System.out.println("Qual o número do avião?\n(para saber o número vá para consulta>número do vôo)");
                    passagem = input.nextInt();
                    for (x = 0; x < 12; x++) {
                        if (passagem == aviao[x]) {
                            if (assentos[x] == 0) {
                                System.out.println("Vôo lotado, procure outro!");
                            } else {
                                System.out.println("Reserva confirmada!");
                                assentos[x]--;
                            }
                            verifica=true;
                        }
                    }
                    if (!verifica){
                        System.out.println("Vôo inexistente!");
                    }
                }
            }else {
                System.out.println("\nValor inválido... Tente novamente!");
            }
        }while(op1!=3);
    }
}
