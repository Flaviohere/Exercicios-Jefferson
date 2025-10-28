import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vitral com Formas");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        PainelDesenho painel = new PainelDesenho();

        painel.adicionarForma(new Circulo(400, 300, new Color(60, 50, 40), 285));

        painel.adicionarForma(new Circulo(400, 300, new Color(170, 200, 255, 230), 260));

        painel.adicionarForma(new Triangulo(480, 260, new Color(255, 120, 120, 180), 200, 200)); // vermelho
        painel.adicionarForma(new Triangulo(350, 360, new Color(80, 255, 150, 180), 250, 200));  // verde
        painel.adicionarForma(new Triangulo(300, 260, new Color(140, 160, 255, 180), 260, 250)); // azul

        painel.adicionarForma(new LinhaGrossa(400, 220, 400, 380, new Color(255, 200, 80), 10)); // haste central
        painel.adicionarForma(new LinhaGrossa(400, 250, 300, 180, new Color(255, 200, 80), 10)); // asa esquerda
        painel.adicionarForma(new LinhaGrossa(400, 250, 500, 180, new Color(255, 200, 80), 10)); // asa direita

        frame.add(painel);
        frame.setVisible(true);
    }
}
