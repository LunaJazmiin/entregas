
package figuraas;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

    
public class Figuraas extends Applet {
  
    public void paint (Graphics g){
        g.setColor(Color.CYAN);
      g.fillRect(0, 0, getWidth(),getHeight());

        g.setColor(Color.pink);
        g.fillRect(50, 50, 100, 100);
        
        
     g.setColor(Color.black);
     g.fillRect(75, 120, 50, 20);
     
     
     g.setColor(Color.blue);
     g.fillOval(50,150,100 ,100);
     
     g.setColor(Color.red);
     g.fillOval(50, 240, 50, 50);
     
       g.setColor(Color.red);
     g.fillOval(100, 240, 50, 50);
     
     g.setColor(Color.black);
     g.fillOval(60, 80, 25,25 );
     
     g.setColor(Color.black);
     g.fillOval(110, 80, 25,25 );
     
     g.setColor(Color.pink);
     g.fillOval(10, 180, 40, 40);
     
     g.setColor(Color.pink);
     g.fillOval(150, 180, 40, 40);
     
     
     
     g.setColor(Color.orange);
     g.fillOval(250, 250, 140, 140);
     
      g.setColor(Color.black);
     g.fillOval(290, 300, 25,25 );
     
     g.setColor(Color.black);
     g.fillOval(340, 300, 25,25 );
     
     g.setColor(Color.black);
     g.fillArc(235, 330, 125, 50, 10, 50);
     
     
     
      g.setColor(Color.yellow);
     g.fillOval(230, 170, 90, 90);
     
     g.setColor(Color.YELLOW);
     g.fillOval(330, 170, 90, 90);
     
     g.setColor(Color.ORANGE);
     g.fillOval(250, 390, 140, 140);
     
     g.setColor(Color.yellow);
     g.fillOval(390, 430, 50, 50);
     
     g.setColor(Color.yellow);
     g.fillOval(200, 430, 50, 50);
     
     g.setColor(Color.yellow);
     g.fillOval(250, 515, 50, 50);
     
     g.setColor(Color.yellow);
     g.fillOval(350, 512, 50, 50);
     
     
    }
}

    
}
