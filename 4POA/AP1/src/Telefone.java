import java.io.Serializable;

public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") " + numero;
    }
}