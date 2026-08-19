public class Main {
    public static void main(String[] args) {
        // 1. Instanciando o Logradouro
        Logradouro endereco = new Logradouro("Rua das Flores", "123", "20000-000");
        
        // 2. Instanciando o Imóvel com a associação ao endereço
        Imovel meuImovel = new Imovel(65.5, "Apartamento", endereco);
        
        System.out.println("--- Dados do Imóvel ---");
        System.out.println(meuImovel);
        System.out.println("-----------------------\n");
        
        // 3. Chamando o LoggerSimples
        System.out.println("Iniciando gravação no logger...");
        
        // Chamamos o método estático passando o toString() do imóvel como mensagem
        LoggerSimples.registrar("Novo imóvel cadastrado: " + meuImovel.toString());
        
        System.out.println("Ação registrada com sucesso! Verifique o arquivo meus_logs.txt.");
    }
}