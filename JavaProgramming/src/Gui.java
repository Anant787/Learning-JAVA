
import javax.swing.*;
import java.awt.*;

class Gui extends Canvas{

    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawArc(450, 170, 350, 350, 0, 360);
        //g.fillArc(20, 30, 50, 40, 0, 360);
        g.fillArc(510, 230, 50, 50, 0,360);
        g.fillArc(670, 230, 50, 50, 0,360);

        g.drawArc(540, 350, 190, 70, 0,-180);


    }

    public static void main(String[] args) {
        Gui obj = new Gui();
        JFrame f = new JFrame();

        f.setSize(1920,1080);
        f.setVisible(true);

        f.add(obj);

    }
}

