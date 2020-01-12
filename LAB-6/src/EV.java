import java.awt.Graphics;

public class EV extends java.applet.Applet {
    @Override
    public void paint(Graphics g) {
       Cati.draw(g);
       Duvar.draw(g);
       SolCam.draw(g);
       SaCam.draw(g);
       Kapi.draw(g);
       Baca.draw(g);
               
    }
}
