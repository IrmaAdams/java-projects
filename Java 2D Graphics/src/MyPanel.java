import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image;
    MyPanel(){
        this.setPreferredSize(new Dimension(600,600));
        image = new ImageIcon("cats.jpeg").getImage();
    }

    public void paint (Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.red);

        g2D.drawLine(0, 0, 600, 600);                       // drawing a line
        g2D.setPaint(Color.blue);
        g2D.drawRect(50, 150, 200, 100);                // drawing a rectangle
        g2D.fillRect(50, 150, 200, 100);                // fill rectangle
        g2D.setPaint(Color.green);
        g2D.drawOval(100,300,100,50);                   // drawing an oval shape
        g2D.fillOval(300,200,200,50);                   // filling an oval shape
        g2D.setPaint(Color.black);
        g2D.setFont(new Font("Ink Free", Font.BOLD,30));       // setting font
        g2D.drawString("You are awesome!",200,50);              // drawing a string of text

        // drawing a triangle:
        g2D.setPaint(Color.LIGHT_GRAY);
        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.fillPolygon(xPoints,yPoints,3);                    // filling a triangle shape
        g2D.setPaint(Color.DARK_GRAY);
        int[] xaPoints = {150,250,350};
        int[] yaPoints = {300,150,300};
        g2D.drawPolygon(xaPoints,yaPoints,3);                  // drawing a triangle shape

        // drawing an arc (poke-ball)
        // top half
        g2D.setPaint(Color.red);
        g2D.fillArc(50,50,50,50,0,180);
        g2D.setPaint(Color.black);
        g2D.setStroke(new BasicStroke(3));
        g2D.drawArc(49,50,50,50,0,180);
        // bottom half
        g2D.setPaint(Color.white);
        g2D.fillArc(50,50,50,50,180,180);
        g2D.setPaint(Color.black);
        g2D.setStroke(new BasicStroke(3));
        g2D.drawArc(49,50,50,50,180,180);

        // adding/drawing an image
        g2D.drawImage(image,50,400,null);
    }
}
