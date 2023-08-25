import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("My JFrame");                // set screen title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // close application (default = hide)
        this.setResizable(false);                  // prevent frame from being resizable
        this.setSize(420,520);         // set x and y dimensions of the frame using int
        this.setVisible(true);                     // makes frame visible

        ImageIcon myLogo = new ImageIcon("logo.jpeg"); // create an image icon
        this.setIconImage(myLogo.getImage());                  // set logo (not working)
        this.getContentPane().setBackground(Color.green);      // set background colour from default list
        this.getContentPane().setBackground(new Color(100,100,100));      // set custom background colour
    }
}
