package ExercícioDois;

public class contaInvestimento extends contaBancaria{

    @Override
    public void depositar(int deposito) {
        this.saldo += deposito;
    }

    @Override
    public void sacar(int saque) {
        this.saldo -= saque;
    }

    @Override
    public void transferir(int transferir ,contaBancaria conta) {
        this.saldo-=transferir;
        conta.depositar(transferir);
    }

    @Override
    public void calcularSaldo(){
        System.out.println("Saldo atual da conta: "+ (this.getSaldo()+this.getSaldo()*5/100));
    }

}
