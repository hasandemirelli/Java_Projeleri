
import java.applet.Applet;
import java.awt.Graphics;

public class Kafa extends Applet {

    public void paint(Graphics graphics){
        graphics.drawOval(100, 100, 200, 200);  //x,y,genişlik,yüksekik
        graphics.drawOval(150, 150, 30, 30);
        graphics.drawOval(200, 150, 30, 30);
        graphics.drawLine(200, 175, 200, 250);  //x0, y0, x1, y1
        graphics.drawArc(180, 180, WIDTH, HEIGHT, ABORT, HEIGHT); // x, y, genişlik, yükseklik, başlangıç açısı, bitiş açısı +yukardan aşağı   - aşağıdan yukarı
    }

}
