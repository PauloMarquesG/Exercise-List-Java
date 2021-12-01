package Bebida;

public class Refrigerante extends Bebida{
    public Refrigerante(){
        super("[REFRIGERANTE]",false);
    }
    @Override
    public void preparar(){
        System.out.println("Pegando um copo");
        System.out.println("Colocando um gelo no copo");
        System.out.println("Colocando o refrigerante");
    }
}
