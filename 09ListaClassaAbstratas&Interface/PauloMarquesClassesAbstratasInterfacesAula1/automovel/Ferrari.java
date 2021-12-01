package automovel;

public class Ferrari implements Carro, ItemCaro {


    @Override
    public void virarEsquerda() {
        System.out.println("Ferrari virou à Esquerda.");
    }

    @Override
    public void virarDireita() {
        System.out.println("Ferrari virou à Direita.");
    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari acelerou.");
    }

    @Override
    public void abrirPorta() {
        System.out.println("Ferrari abriu a Porta.");
    }

    @Override
    public double getPreco() {
        return 750000;
    }

}
