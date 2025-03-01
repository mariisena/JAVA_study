class ContaBancaria2 {
    private double saldo;

    public ContaBancaria2(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    protected void descontarSaldo(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para cobrar a tarifa.");
        }
    }
}

class ContaCorrente extends ContaBancaria2 {
    private double tarifaMensal;

    public ContaCorrente(double saldoInicial, double tarifaMensal) {
        super(saldoInicial);
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        System.out.println("Cobrando tarifa mensal de R$ " + tarifaMensal);
        descontarSaldo(tarifaMensal);
        consultarSaldo();
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }
}

public class PraticaAluraVI_ContaBancaria {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000, 10.0);
        contaCorrente.consultarSaldo();
        
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}