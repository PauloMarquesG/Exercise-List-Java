package ExercícioUm;

import com.sun.prism.ReadbackGraphics;

public class aplic {
    public static void main(String[] args) {

        double area;

        AreaCalculavel a1 = new Quadrado(2);
        area = a1.calcularArea();
        System.out.println(area);

        AreaCalculavel a2 = new Retangulo(3,2);
        area = a2.calcularArea();
        System.out.println(area);

        AreaCalculavel a3 = new Circunferencia(3);
        area = a3.calcularArea();
        System.out.println(area);

    }
}
