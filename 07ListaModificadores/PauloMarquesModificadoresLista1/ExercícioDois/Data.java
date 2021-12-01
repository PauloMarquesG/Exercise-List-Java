package ExercícioDois;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private Integer hora;
    private int minuto;
    private int segundo;

    public static final int FORMATO_12H;
    public static final int FORMATO_24H;

    static {
        FORMATO_12H = 12;
        FORMATO_24H = 0;
    }

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public Data(int d, int m, int a, int h, int min, int s) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
        this.hora = h;
        this.minuto = min;
        this.segundo = s;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }


    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }


    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }


    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void imprimir(int formato) {
        if (hora != null ) {
            if (hora >=0 && hora <= 23) {
                if (formato == 12) {
                    if (hora >= 13) {
                        System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno() + "  " + (this.getHora() - formato) + ":" + this.getMinuto() + ":" + this.getSegundo() + " PM");
                    } else {
                        System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno() + "  " + this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo() + " AM");
                    }
                } else {
                    System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno() + "  " + this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo());
                }
            }
        }else {
            System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno());
        }
    }
}
