package automovel;



public class aplicAutmovel {

    public static void main(String[] args) {
        Ferrari ferrari1 = new Ferrari();
        //Rota rota1 = new Rota();
        //rota1.ir(ferrari1);
        //ferrari1.abrirPorta();

        Vendedor vemdedor1 = new Vendedor();
        vemdedor1.mostrarPreco(ferrari1);
    }

}
