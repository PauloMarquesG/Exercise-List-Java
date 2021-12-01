package ExercicioUm;

public class Lampada {

    private boolean Status;

    public Lampada(boolean Status){
        this.Status = Status;
    }

    public void Ligar(){
        Status = true;
    }

    public void Desligar(){
        Status = false;
    }

    public void imprimir(){
        if (Status){
            System.out.println("Lâmpada Ligada");
        }else{
            System.out.println("Lâmpada Desligada");
        }
    }

}
