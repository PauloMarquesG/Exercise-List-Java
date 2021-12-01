public class Aplic {
    public static void main(String[] args) {
        Matematica mat = new Matematica();
        int soma = mat.somar(12,23);
        System.out.println(soma);

        int soma2 = mat.somar(12,23,34);
        System.out.println(soma2);

        double soma3 = mat.somar(9.5,5.75);
        System.out.println(soma3);
    }
}
