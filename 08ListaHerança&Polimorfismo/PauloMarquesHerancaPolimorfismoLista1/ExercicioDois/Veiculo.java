package ExercicioDois;

public class Veiculo {
    protected boolean ligado;

    // construtor para que todos veiculos novos comecem desligados
    public Veiculo() {
        this.ligado = false;
    }

    // metodo para ligar
    public void ligar() {
        this.ligado = true;
    }

    // metodo para desligar
    public void desligar() {
        this.ligado = false;
    }

    // metodo para dizer true or false
    public boolean isLigado() {
        return ligado;
    }

    // metodo para imprimir algo
    public void imprimir() {

    }

}
