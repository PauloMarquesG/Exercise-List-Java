package Veiculo;

public class Aplic {

    public static void main(String[] args) {
        Veiculo veiculo1= new Veiculo();
        veiculo1.setMarca("BMW");
        veiculo1.setModelo("120i Sport");
        veiculo1.setAno(2019);

        System.out.println("Veículo:");
        veiculo1.imprimir();
        veiculo1.buzinar();

        System.out.println();

        Carro carro1 = new Carro();
        carro1.setMarca("BMW");
        carro1.setModelo("120i Sport");
        carro1.setAno(2019);
        carro1.setQuatroPortas(true);

        System.out.println("Veículo:");
        carro1.imprimir();
        carro1.buzinar();

        System.out.println();

        Motocicleta moto1 = new Motocicleta();
        System.out.println("Motocicleta:");
        moto1.buzinar();
        moto1.empinar();

    }

}
