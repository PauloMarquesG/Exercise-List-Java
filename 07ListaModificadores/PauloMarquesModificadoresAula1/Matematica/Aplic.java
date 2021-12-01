package Matematica;

public class Aplic {

    public static void main(String[] args) {
         Retangulo retangulo1 = new Retangulo();
         double area1 = retangulo1.calcularArea();
         System.out.println("Área do retângulo 1: "+ area1);

        Retangulo retangulo2 = new Retangulo(5,7);
        double area2 = retangulo2.calcularArea();
        System.out.println("Área do retângulo 2: "+ area2);

        Quadrado quadrado1 = new Quadrado(7);
        System.out.println("Área do quadrado 1: "+ quadrado1.CalcularArea());
    }

}
