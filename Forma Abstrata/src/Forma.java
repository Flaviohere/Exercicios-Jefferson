import java.awt.*;

public abstract class Forma {
    protected int x, y;
    protected Color cor;

    public Forma(int x, int y, Color cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    public abstract void desenhar(Graphics g);
    public abstract double calcularArea();
}
