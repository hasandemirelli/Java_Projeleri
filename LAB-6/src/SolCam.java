import java.awt.Graphics;

public class SolCam {
    public static void draw(Graphics g) {
        g.drawLine(70, 220, 90, 220); // üst
        g.drawLine(70, 240, 90, 240); // Alt
        g.drawLine(70, 220, 70, 240); // Sol
        g.drawLine(90, 220, 90, 240); // Sağ
    }
}
