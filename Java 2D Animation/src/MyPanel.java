import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 1280;
    final int PANEL_HEIGHT = 681;
    Image spaceShip;
    Image space;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        spaceShip = new ImageIcon("spaceship.png").getImage();
        space = new ImageIcon("space.png").getImage();

        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(space, 0, 0, null);
        g2D.drawImage(spaceShip, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - spaceShip.getWidth(null) || x <0) {
            xVelocity = xVelocity * -1;
        }

        if (y >= PANEL_HEIGHT - spaceShip.getHeight(null) || y <0) {
            yVelocity = yVelocity * -1;
        }

        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
    }
}
