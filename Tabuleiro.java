import java.io.IOException;

public class Tabuleiro {
    private int[][] matriz;
    private Robo robo;

    public Tabuleiro(int linha_inicial, int coluna_inicial, String nome_arquivo) throws IOException {
        matriz = new int[20][20];
        robo = new Robo(nome_arquivo, linha_inicial, coluna_inicial);
    }

    public void executar() {
        int[] comandos = robo.get_comandos();
        for (int i = 0; i < comandos.length; i++) {
            switch (comandos[i]) {
                case 1 -> robo.ativar_caneta();
                case 2 -> robo.desativar_caneta();
                case 3 -> robo.virar_esquerda();
                case 4 -> robo.virar_direita();
                case 5 -> {
                    if (i + 1 < comandos.length) {
                        int passos = comandos[++i];
                        robo.andar(passos, matriz);
                    }
                }
                case 6 -> mostrar_tabuleiro();
            }
        }
    }

    public void mostrar_tabuleiro() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i == robo.get_linha() && j == robo.get_coluna()) {
                    System.out.print("R ");
                } else if (matriz[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println("Robô está em (" + robo.get_linha() + "," + robo.get_coluna() + ") voltado para " + robo.get_direcao());
    }
}
