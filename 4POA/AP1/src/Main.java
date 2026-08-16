import java.io.*;

public class Main {
    public static void main(String[] args) {
        String arquivoDados = "dados_pessoa.ser";

        LoggerSimples.registrar("Iniciando a execução do programa.");

        Telefone tel = new Telefone("21", "98765-4321");
        Pessoa pessoaOriginal = new Pessoa("Carlos Silva", tel);
        
        LoggerSimples.registrar("Objeto Pessoa criado na memória: " + pessoaOriginal.getNome());

        try (FileOutputStream fos = new FileOutputStream(arquivoDados);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(pessoaOriginal);
            LoggerSimples.registrar("Objeto Pessoa foi SERIALIZADO com sucesso no arquivo " + arquivoDados);
            System.out.println("Objeto salvo no disco!");

        } catch (IOException e) {
            LoggerSimples.registrar("ERRO na serialização: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(arquivoDados);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            Pessoa pessoaRecuperada = (Pessoa) ois.readObject();
            LoggerSimples.registrar("Objeto Pessoa foi DESSERIALIZADO com sucesso.");
            
            System.out.println("\n--- Dados Recuperados do Disco ---");
            System.out.println(pessoaRecuperada.toString());

        } catch (IOException | ClassNotFoundException e) {
            LoggerSimples.registrar("ERRO na desserialização: " + e.getMessage());
        }

        LoggerSimples.registrar("Fim da execução do programa.\n");
    }
}