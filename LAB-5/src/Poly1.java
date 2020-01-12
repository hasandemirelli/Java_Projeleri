
import java.awt.Graphics;


public class Poly1 extends java.applet.Applet {
    @Override
    public void paint(Graphics g) {
       Head objHead= new Head();
       objHead.draw(g);
       RightEye objRightEye =new RightEye();
       objRightEye.draw(g);
       LeftEye objlLeftEye = new LeftEye();
       objlLeftEye.draw(g);
       Nose objNose=new Nose();
       objNose.draw(g);
       Mouth objMouth= new Mouth();
       objMouth.draw(g);
               
    }
}
