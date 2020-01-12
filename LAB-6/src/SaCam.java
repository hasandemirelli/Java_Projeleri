import java.awt.Graphics;

public class SaCam {
    public static void draw(Graphics g) {
        g.drawLine(110, 220, 130, 220); // üst
        g.drawLine(110, 240, 130, 240); // Alt
        g.drawLine(110, 220, 110, 240); // Sol
        g.drawLine(130, 220, 130, 240); // Sağ
    }
}
