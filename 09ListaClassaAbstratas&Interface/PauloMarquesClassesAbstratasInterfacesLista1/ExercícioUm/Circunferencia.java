package ExercícioUm;

public class Circunferencia implements AreaCalculavel{

    private double raio;

    public Circunferencia(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * (raio * raio);
    }

}
