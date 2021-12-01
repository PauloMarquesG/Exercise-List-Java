public class Aplicacao {
    public static void main(String[] args) {
        Fracao f1 = new Fracao();
        f1.definirValor(5,2);

        Fracao f2 = new Fracao();
        f2.definirValor(1,7);

        Fracao f3 = f1.multiplicar(f2);

        System.out.println(f3.obterFracao());
        System.out.println(f3.calcularValor());
    }
}
