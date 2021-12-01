package ExercicioUm;

public class Aplic {
    public static void main(String[] args) {

        Lampada lampada1 = new Lampada(true);

        lampada1.imprimir();

        lampada1.Desligar();
        lampada1.imprimir();

        lampada1.Ligar();
        lampada1.imprimir();
    }
}
