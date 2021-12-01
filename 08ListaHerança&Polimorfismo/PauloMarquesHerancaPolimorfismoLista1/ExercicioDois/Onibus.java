package ExercicioDois;

public class Onibus extends Veiculo {

    @Override // sobrescrever o metodo de imprimir para onibus
    public void imprimir() {
        if (ligado) {
            System.out.println("ônibus ligado!");
        } else {
            System.out.println("ônibus desligado!");
        }
        System.out.println(isLigado());

    }
}
