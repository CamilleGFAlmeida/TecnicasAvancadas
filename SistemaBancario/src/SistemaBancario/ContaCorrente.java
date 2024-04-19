package SistemaBancario;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroAgencia, String numeroConta, double saldo, String nomeTitular, double limiteChequeEspecial) {
    	// herdando os atributos da classe mãe Conta | Conta = superclasse de ContaCorrente
       // atributos comuns a todas as contas 
    	super(numeroAgencia, numeroConta, "Corrente", saldo, nomeTitular); 
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public boolean sacar(double valor) {
        if (getSaldo() + limiteChequeEspecial >= valor) {
            getSaldo();
            return true;
        }
        return false;
    }
}