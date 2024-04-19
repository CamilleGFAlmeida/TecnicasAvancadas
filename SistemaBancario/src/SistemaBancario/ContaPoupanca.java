package SistemaBancario;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numeroAgencia, String numeroConta, double saldo, String nomeTitular, double taxaRendimento) {
       /* Classe mãe = Conta / SubClasse = ContaPoupanca */  
    	super(numeroAgencia, numeroConta, "Poupança", saldo, nomeTitular);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void renderJuros() {
        double juros = getSaldo() * taxaRendimento / 100;
        depositar(juros);
    }
}
