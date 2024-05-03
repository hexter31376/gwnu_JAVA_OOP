import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel extends JPanel {
    final int Up = 0, Dn = 1, Rt =2, Lt = 3;
    private int x = 200-50, y = 200 - 50;

    MyPanel() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(400, 400));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawOval(x, y, 50, 50);
    }

    public void move_circle(){
        int ewsn = (int)(Math.random() * 1000) % 4; // E, W, S, N
        int disp = (int)(Math.random() * 1000) % 30;

        switch(ewsn) {
            case Up : y = y; y -= disp; if (y < 0) y = 0;
                break;
            case Up : y = y; y += disp; if (350-50 < 0) y = 0;
                break;
            case Up : x = x; x -= disp; if (400-50 < 0) y = 0;
                break;
            case Up : x = x; x += disp; if (y < 0) y = 0;
                break;
        }

        repaint();
    }
}