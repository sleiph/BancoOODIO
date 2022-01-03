public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return String.format(
                "Agência: %d, número: %d, titular: %s, Conta Poupança.", agencia, numero, cliente
        );
    }
}
