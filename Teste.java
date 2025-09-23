public class Teste {
    public static void main(String[] args) {
        try {
            Tabuleiro tabuleiro = new Tabuleiro(10, 10, "comandos.txt");
            tabuleiro.executar();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
