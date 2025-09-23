import java.io.*;

public class Robo {
    private boolean caneta_ativa;
    private String direcao;
    private int linha;
    private int coluna;
    private int[] comandos;

    public Robo(String nome_arquivo, int linha_inicial, int coluna_inicial) throws IOException {
        caneta_ativa = false;
        direcao = "norte";
        linha = linha_inicial;
        coluna = coluna_inicial;
        comandos = ler_comandos(nome_arquivo);
    }

    private int[] ler_comandos(String nome_arquivo) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(nome_arquivo));
        String linha = leitor.readLine();
        leitor.close();
        String[] partes = linha.split(",");
        int[] vetor = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            vetor[i] = Integer.parseInt(partes[i].trim());
        }
        return vetor;
    }

    public void ativar_caneta() {
        caneta_ativa = true;
    }

    public void desativar_caneta() {
        caneta_ativa = false;
    }

    public void virar_esquerda() {
        switch (direcao) {
            case "norte" -> direcao = "oeste";
            case "oeste" -> direcao = "sul";
            case "sul" -> direcao = "leste";
            case "leste" -> direcao = "norte";
        }
    }

    public void virar_direita() {
        switch (direcao) {
            case "norte" -> direcao = "leste";
            case "leste" -> direcao = "sul";
            case "sul" -> direcao = "oeste";
            case "oeste" -> direcao = "norte";
        }
    }

    public void andar(int passos, int[][] tabuleiro) {
        for (int i = 0; i < passos; i++) {
            if (caneta_ativa) {
                tabuleiro[linha][coluna] = 1;
            }
            switch (direcao) {
                case "norte" -> linha--;
                case "sul" -> linha++;
                case "leste" -> coluna++;
                case "oeste" -> coluna--;
            }
        }
    }

    public int[] get_comandos() {
        return comandos;
    }

    public int get_linha() {
        return linha;
    }

    public int get_coluna() {
        return coluna;
    }

    public String get_direcao() {
        return direcao;
    }
}
