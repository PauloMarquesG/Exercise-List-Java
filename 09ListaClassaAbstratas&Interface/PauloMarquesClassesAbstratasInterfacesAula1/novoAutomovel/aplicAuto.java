package novoAutomovel;

public class aplicAuto {
    public static void main(String[] args) {
        Jaguar jaguar1 = new Jaguar();
        Porsche porsche1 = new Porsche();

        jaguar1.derrarpar();
        porsche1.derrarpar();

        System.out.println();

        int velMax = NovoAutomovel.getVelocidadeMaxima();
        System.out.println("A velocidade máxima é "+ velMax +" p/h.");

    }
}
