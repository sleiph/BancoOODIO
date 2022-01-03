public class Main {
    public static void main(String[] args) {
        Cliente ricardo = new Cliente();
        ricardo.setNome("Ricardo");

        Conta myCC = new ContaCorrente(ricardo);
        Conta myCP = new ContaPoupanca(ricardo);

        myCC.depositar(100);
        myCC.transferir(100, myCP);

        myCC.imprimirExtrato();
        myCP.imprimirExtrato();
    }
}
