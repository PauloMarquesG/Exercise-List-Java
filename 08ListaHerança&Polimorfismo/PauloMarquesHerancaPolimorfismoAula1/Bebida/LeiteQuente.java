package Bebida;

public class LeiteQuente extends Bebida{
    public LeiteQuente(){
        super("[LeiteQuente]",true);
    }
    @Override
    public void preparar(){
        System.out.println("Pegando um copo");
        System.out.println("Colocando o leite no copo");
    }
}
