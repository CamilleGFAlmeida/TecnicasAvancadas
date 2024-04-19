package SistemaBancario;

public class TesteBanco {
    public static void main(String[] args) {
        // Criando uma Conta Corrente
        ContaCorrente cc = new ContaCorrente("001", "55555-2", 2000.0, "Marcela", 500.0);

        // Testando os métodos e atributos da Conta Corrente
        System.out.println("Informações da Conta Corrente:");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Agência: " + cc.getNumeroAgencia());
        System.out.println("Conta: " + cc.getNumeroConta());
        System.out.println("Tipo de Conta: " + cc.getTipoConta());
        System.out.println("Saldo inicial: " + cc.getSaldo());
        System.out.println("Nome do Titular: " + cc.getNomeTitular());
        cc.depositar(400.0);
        System.out.println("Saldo após depósito: " + cc.getSaldo());
        cc.sacar(150.0);
        System.out.println("Saldo após saque: " + cc.getSaldo());
        System.out.println();

        // Criando uma Conta Poupança
        ContaPoupanca cp = new ContaPoupanca("001", "77777-3", 500.0, "Luisa", 1.5);

        // Testando os métodos e atributos da Conta Poupança
        System.out.println("Informações da Conta Poupança:");
        System.out.println("Agência: " + cp.getNumeroAgencia());
        System.out.println("Conta: " + cp.getNumeroConta());
        System.out.println("Tipo de Conta: " + cp.getTipoConta());
        System.out.println("Saldo inicial: " + cp.getSaldo());
        System.out.println("Nome do Titular: " + cp.getNomeTitular());
        cp.depositar(200.0);
        System.out.println("Saldo após depósito: " + cp.getSaldo());
        cp.renderJuros();
        System.out.println("Saldo após rendimento de juros: " + cp.getSaldo());
        System.out.println();

        // Testando transferência entre contas
        System.out.println("Transferência de R$200 da Conta Poupança para a Conta Corrente:");
        if (cp.transferir(cc, 200.0)) {
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
        System.out.println("Saldo da Conta Poupança após transferência: " + cp.getSaldo());
        System.out.println("Saldo da Conta Corrente após transferência: " + cc.getSaldo());
    }
}

/* não tinha testado todas os métodos */ 
/* public class TesteBanco {
    public static void main(String[] args) {
    	
    	System.out.println("Testando Banco");
    	System.out.println("-----------------------------------------------------------");
    	System.out.println("Conta Bancária \n-----------------------------------------------------------");
        
    	ContaCorrente cc = new ContaCorrente("001", "55555-2", 1000.0, "Marcela", 500.0);
        ContaPoupanca cp = new ContaPoupanca("001", "77777-3", 500.0, "Luisa", 1.5);
        
        cc.depositar(300.0);
        cc.sacar(150.0);
        cc.consultar();

        cp.renderJuros();
        cp.consultar();
    }
} */ 

