package ExercícioDois;

public abstract class contaBancaria {

    protected int saldo;

    public abstract void depositar(int deposito);

    public abstract void sacar(int saque);

    public abstract void transferir(int transferir, contaBancaria conta);

    public void calcularSaldo() {
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
