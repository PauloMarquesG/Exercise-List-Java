package ExercícioDois;

public class Aplic {
    public static void main(String[] args) {

        Data data1 = new Data(10,06,2003,0,0,0);
        data1.imprimir(Data.FORMATO_12H);
        data1.imprimir(Data.FORMATO_24H);

        Data data2 = new Data(10,06,2003,17,30,00);
        data2.imprimir(Data.FORMATO_12H);
        data2.imprimir(Data.FORMATO_24H);

        Data data3 = new Data(10,06,2003);
        data3.imprimir(Data.FORMATO_12H);
        data3.imprimir(Data.FORMATO_24H);
    }
}
