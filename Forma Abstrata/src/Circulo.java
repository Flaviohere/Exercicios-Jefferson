import java.awt.*;

public class Circulo extends Forma {
    private int raio;

    public Circulo(int x, int y, Color cor, int raio) {
        super(x, y, cor);
        this.raio = raio;
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillOval(x - raio, y - raio, raio * 2, raio * 2);
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
