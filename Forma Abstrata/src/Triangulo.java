import java.awt.*;

public class Triangulo extends Forma {
    private int base, altura;

    public Triangulo(int x, int y, Color cor, int base, int altura) {
        super(x, y, cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        int[] xs = {x, x - base / 2, x + base / 2};
        int[] ys = {y - altura / 2, y + altura / 2, y + altura / 2};
        g.fillPolygon(xs, ys, 3);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}
