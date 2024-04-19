package SistemaBancario;

public class Banco {
    private static int quantidadeTotalContas = 0;

    public static int getQuantidadeTotalContas() {
        return quantidadeTotalContas;
    }

    public static void incrementarQuantidadeTotalContas() {
        quantidadeTotalContas++;
    }
}





