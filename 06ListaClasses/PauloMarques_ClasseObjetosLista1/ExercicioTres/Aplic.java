public class Aplic {
    public static void main(String[] args) {

        Triangulo tria = new Triangulo();
        tria.resulTri(4,6);
        System.out.println(tria.calcularArea());

        Quadrado quad = new Quadrado();
        quad.resulQuad(5);
        System.out.println(quad.calcularArea());

        Circunferencia circ = new Circunferencia();
        circ.resulCirc(3);
        System.out.println(circ.calcularArea());

        Trapezio trap = new Trapezio();
        trap.resulTrap(4,6,2);
        System.out.println(trap.calcularArea());

    }
}
