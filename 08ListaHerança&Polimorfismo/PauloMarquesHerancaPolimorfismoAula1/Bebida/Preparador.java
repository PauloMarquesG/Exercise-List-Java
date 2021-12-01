package Bebida;

public class Preparador {

    public void prepararBebida(Bebida bebida){
        System.out.println("Preparando a bebida "+ bebida.getNome());

        bebida.preparar();
        if (bebida.isAquecer()){
            System.out.println("Aquecimento a bebida "+ bebida.getNome());
        }
        System.out.println("A bebida foi preparada com sucesso!");
    }

}
