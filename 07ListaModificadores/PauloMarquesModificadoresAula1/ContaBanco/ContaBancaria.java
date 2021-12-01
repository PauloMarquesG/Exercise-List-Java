package ContaBanco;

import com.sun.jmx.snmp.SnmpUnknownModelException;

public class ContaBancaria {

    private int numConta;
    private boolean ativa;
    private double saldoConta;

    public void depositar(double valor) {
        if (valor < 0) {
            return;
        }
        saldoConta += valor;
    }

    public void sacar(double valor) {
        if (valor < 0) {
            return;
        }
        saldoConta -= valor;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        if (numConta>0){
            this.numConta = numConta;
        }
    }

    public boolean isAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public double getSaldoConta(){
        return saldoConta;
    }

}
