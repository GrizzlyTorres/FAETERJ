import java.io.Serializable;

public class Imovel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private double area;
    private double valor;
    private String tipo; // Agora é uma String
    private Logradouro logradouro; 

    public Imovel(double area, String tipo, Logradouro logradouro) {
        this.area = area;
        this.tipo = tipo;
        this.logradouro = logradouro;
        calcularValor(); // Calcula o valor na instanciação
    }

    public void setArea(double area) {
        this.area = area;
        calcularValor(); 
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
        calcularValor();
    }

    private void calcularValor() {
        double valorMetroQuadrado;
        
        // Verifica a String para definir o valor do metro quadrado
        if (this.tipo != null && this.tipo.equalsIgnoreCase("kitnet")) {
            valorMetroQuadrado = 3000.0;
        } else if (this.tipo != null && this.tipo.equalsIgnoreCase("casa")) {
            valorMetroQuadrado = 4500.0;
        } else {
            // Assume "apartamento" ou qualquer outro valor como padrão
            valorMetroQuadrado = 6000.0;
        }
        
        this.valor = this.area * valorMetroQuadrado;
    }

    public double getArea() { return area; }
    public double getValor() { return valor; }
    public String getTipo() { return tipo; }
    public Logradouro getLogradouro() { return logradouro; }

    @Override
    public String toString() {
        return "Imóvel [" + tipo + "] - Área: " + area + "m² | Valor Estimado: R$" + valor + "\nEndereço: " + logradouro.toString();
    }
}