package ExercicioDois;

public class Motocicleta extends Veiculo {

    @Override // sobrescrever o metodo de imprimir para motocicletas
    public void imprimir() {
        if (ligado) {
            System.out.println("Motocicleta ligado!");
        } else {
            System.out.println("Motocicleta desligado!");
        }
        System.out.println(isLigado());

    }
}
