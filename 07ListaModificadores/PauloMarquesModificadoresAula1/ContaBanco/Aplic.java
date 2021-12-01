package ContaBanco;

public class Aplic {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumConta(5343);
        conta.setAtiva(true);

        conta.depositar(1000);
        conta.sacar(250);

        double saldoConta = conta.getSaldoConta();

        System.out.println("Saldo da conta: "+ saldoConta);
    }

}
