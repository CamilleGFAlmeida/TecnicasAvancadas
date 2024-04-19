package SistemaBancario;

public class Conta {
    private String numeroAgencia;
    private String numeroConta;
    private String tipoConta;
    private double saldo;
    private String nomeTitular;

    public Conta(String numeroAgencia, String numeroConta, String tipoConta, double saldo, String nomeTitular) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
        Banco.incrementarQuantidadeTotalContas();
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void consultar() {
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Agência: " + numeroAgencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
    }
}
