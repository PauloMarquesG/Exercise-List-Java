public class Matematica {

    int somar(int x, int y) {
        return x + y;
    }

    //sobrecarga de metodos com assinatura diferente
    int somar(int x, int y, int z) {
        System.out.println("int somar(int x, int y, int z)");
        return x + y + z;
    }

    double somar(double x, double y){
        System.out.println("dobule somar(double x, double y)");
        return x+y;
    }

}
