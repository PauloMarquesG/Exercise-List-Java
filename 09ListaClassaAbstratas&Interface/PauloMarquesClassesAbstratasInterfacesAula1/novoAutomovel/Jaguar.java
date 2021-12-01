package novoAutomovel;

public class Jaguar implements NovoAutomovel{

    @Override
    public void acelerar(){
        System.out.println("Jaguar acelerou.");
    }

    @Override
    public void frear(){
        System.out.println("Jaguar freou.");
    }

}
