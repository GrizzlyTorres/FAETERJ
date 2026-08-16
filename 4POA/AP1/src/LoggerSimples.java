import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerSimples {
    private static final String ARQUIVO_LOG = "meus_logs.txt";

    public static void registrar(String mensagem) {
        try (FileWriter fw = new FileWriter(ARQUIVO_LOG, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            
            String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            out.println("[" + dataHora + "] INFO: " + mensagem);
            
        } catch (IOException e) {
            System.err.println("Falha ao escrever no arquivo de log: " + e.getMessage());
        }
    }
}