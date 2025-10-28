import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PainelDesenho extends JPanel {
    private final ArrayList<Forma> formas = new ArrayList<>();

    public void adicionarForma(Forma f) {
        formas.add(f);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Forma f : formas) {
            f.desenhar(g);
        }
    }
}
