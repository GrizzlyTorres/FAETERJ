import java.io.Serializable;

public class Logradouro implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String rua;
    private String numero;
    private String cep;

    public Logradouro(String rua, String numero, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public String getRua() { return rua; }
    public String getNumero() { return numero; }
    public String getCep() { return cep; }

    @Override
    public String toString() {
        return rua + ", " + numero + " - CEP: " + cep;
    }
}