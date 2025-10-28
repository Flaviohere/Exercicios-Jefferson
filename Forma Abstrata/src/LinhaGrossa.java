import java.awt.*;

public class LinhaGrossa extends Forma {
    private int x2, y2;
    private float espessura;

    public LinhaGrossa(int x1, int y1, int x2, int y2, Color cor, float espessura) {
        super(x1, y1, cor);
        this.x2 = x2;
        this.y2 = y2;
        this.espessura = espessura;
    }

    @Override
    public void desenhar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(cor);
        g2.setStroke(new BasicStroke(espessura, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2.drawLine(x, y, x2, y2);
    }

    @Override
    public double calcularArea() {
        return 0; // não faz sentido para linha
    }
}
