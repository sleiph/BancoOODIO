public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return String.format(
                "Agência: %d, número: %d, titular: %s, Conta Corrente.", agencia, numero, cliente
        );
    }
}
