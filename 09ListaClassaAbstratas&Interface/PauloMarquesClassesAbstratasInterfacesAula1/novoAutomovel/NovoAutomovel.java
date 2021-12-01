package novoAutomovel;

public interface NovoAutomovel {

    void acelerar();
    void frear();

    default void derrarpar(){
        acelerar();
        acelerar();
        frear();
    }

    static int getVelocidadeMaxima(){
        return 300;
    }

}
