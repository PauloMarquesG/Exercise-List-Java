package Matematica;

public class Quadrado {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double CalcularArea(){
        return lado * lado;
    }

}
