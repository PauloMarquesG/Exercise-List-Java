package Veiculo;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;

    public void buzinar(){
        System.out.println("BI BI BI BIIII!!!!");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimir(){
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ano: "+this.getAno());
    }
}
