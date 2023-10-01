import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);       // place component in the center of the screen when set to null
        this.setVisible(true);

        // Java documentation on paint method in the Component class:  public void paint(Graphics g)
        // docs.oracle.com/javase/7/docs/api/java/awt/Component.html#paint(java.awt.Graphics)
        // Graphics 2D is a sub-class of Graphics g
        // Test Get Frame

    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)  g;

        g2D.drawLine(0,0,500,500);
    }
}
