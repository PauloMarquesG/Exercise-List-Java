package ExercicioDois;

public class aplic {
    public static void main(String[] args) {
        Veiculo carro1 = new Automovel();
        carro1.ligar();
        carro1.imprimir();

        System.out.println();

        Veiculo moto1 = new Motocicleta();
        moto1.desligar();
        moto1.imprimir();

        System.out.println();

        Veiculo onibus1 = new Onibus();
        onibus1.desligar();
        onibus1.imprimir();

    }
}
