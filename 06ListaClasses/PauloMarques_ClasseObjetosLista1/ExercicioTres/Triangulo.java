public class Triangulo {

    double base, altura;

    public void resulTri(double b, double h){
        base = b;
        altura = h;
    }

    public double calcularArea(){
        return base*altura/2;
    }

}
