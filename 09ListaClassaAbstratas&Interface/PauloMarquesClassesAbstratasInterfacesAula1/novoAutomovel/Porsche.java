package novoAutomovel;

public class Porsche implements  NovoAutomovel{

    @Override
    public void acelerar(){
        System.out.println("Porsche acelerou.");
    }

    @Override
    public void frear(){
        System.out.println("Porsche freou.");
    }

}
