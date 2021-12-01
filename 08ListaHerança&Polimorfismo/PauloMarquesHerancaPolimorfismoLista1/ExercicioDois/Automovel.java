package ExercicioDois;

public class Automovel extends Veiculo {

    @Override // sobrescrever o metodo de imprimir para automoveis
    public void imprimir() {
        if (ligado) {
            System.out.println("Automóvel ligado!");
        } else {
            System.out.println("Automóvel desligado!");
        }
        System.out.println(isLigado());

    }
}
