import java.io.Serializable;

public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private Telefone telefone;

    public Pessoa(String nome, Telefone telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', telefone=" + telefone + "}";
    }
}