package ExercícioUm;

public class Retangulo implements AreaCalculavel{

    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base * altura/2;
    }

}
