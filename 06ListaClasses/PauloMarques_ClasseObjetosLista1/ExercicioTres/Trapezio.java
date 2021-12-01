public class Trapezio {

    double baseMaior,baseMenor,altura;

    public void resulTrap(double b, double B, double h){
        baseMenor = b;
        baseMaior = B;
        altura = h;
    }

    double calcularArea(){
        return (baseMaior+baseMenor)/2+altura;
    }

}
