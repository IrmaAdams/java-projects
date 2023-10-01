// Java documentation on paint method in the Component class:  public void paint(Graphics g)
// docs.oracle.com/javase/7/docs/api/java/awt/Component.html#paint(java.awt.Graphics)
// Graphics2D is a sub-class of GraphicsG

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;
    MyFrame(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);                 // don't need to set layout if you use a panel
//        this.setSize(500,500);                // don't need to set a size for the frame if you use a panel

        this.add(panel);
        this.pack();                            // be sure to pack this after adding all the components
        this.setLocationRelativeTo(null);       // place component in the center of the screen when set to null
        this.setVisible(true);
    }

    //***************************************************************************************************************
    // Drawing in a JFrame will ignore the window bar - the drawing area will include the area under the window bar
    // if you don't want this, it will be better to draw in a panel, and add the panel to the frame

//    public void paint(Graphics g){
//        Graphics2D g2D = (Graphics2D)  g;
//        g2D.drawLine(0,0,500,500);
//    }
    //***************************************************************************************************************

    // since a JPanel is considered a component, you can call the paint method:

}
