import java.awt.*;

public class Retangulo extends Forma {
    private int largura, altura;

    public Retangulo(int x, int y, Color cor, int largura, int altura) {
        super(x, y, cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillRect(x - largura / 2, y - altura / 2, largura, altura);
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
