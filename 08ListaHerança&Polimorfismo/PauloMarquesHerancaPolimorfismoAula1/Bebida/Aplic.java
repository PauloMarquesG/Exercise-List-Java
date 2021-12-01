package Bebida;

public class Aplic {
    public static void main(String[] args) {
        Preparador preparador = new Preparador();
        LeiteQuente leite = new LeiteQuente();
        preparador.prepararBebida(leite);
        System.out.println();
        Refrigerante refri = new Refrigerante();
        preparador.prepararBebida(refri);
    }
}
