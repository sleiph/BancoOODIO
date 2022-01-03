import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listarClientes() {
        System.out.println(String.format(
                "=== Contas do banco %s ===", nome
        ));
        for (Conta conta : contas) {
            System.out.println( conta );
        }
    }
}
