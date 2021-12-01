public class Fracao {
    double numerador;
    double denominador;

    double calcularValor(){
        if (denominador==0){
            return 0;
        }
        return numerador/denominador;
    }

    Fracao multiplicar(Fracao f){
        Fracao result = new Fracao();

        result.numerador = this.numerador * f.numerador;
        result.denominador = this.denominador * f.denominador;

        return result;
    }
    void definirValor(double numerador, double denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    String obterFracao(){
        return numerador +"/"+ denominador;
    }
}
