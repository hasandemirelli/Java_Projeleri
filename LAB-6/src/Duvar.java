
import java.awt.Graphics;


public class Duvar {
    public static void draw(Graphics g) {
        g.drawLine(50, 200, 150, 200); // üst
        g.drawLine(50, 300, 150, 300); // Alt
        g.drawLine(50, 200, 50, 300); // Sol
        g.drawLine(150, 200, 150, 300); // Sağ
    }
}
