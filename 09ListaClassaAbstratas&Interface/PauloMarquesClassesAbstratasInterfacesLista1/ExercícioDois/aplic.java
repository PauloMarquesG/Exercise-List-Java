package ExercícioDois;

public class aplic {
    public static void main(String[] args) {
        contaCorrente conta1 = new contaCorrente();
        conta1.depositar(1000);
        conta1.sacar(250);

        contaInvestimento conta2 = new contaInvestimento();
        conta2.depositar(1050);
        conta2.sacar(180);


        conta2.transferir(50,conta1);

        conta1.calcularSaldo();
        conta2.calcularSaldo();
    }
}
