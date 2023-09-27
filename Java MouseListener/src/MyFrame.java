import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {



    // create a mouse listener to a label:
    // declare a label
    JLabel label;

    ImageIcon burger;
    ImageIcon fries;
    ImageIcon pizza;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);

        // instantiate a label
        label = new JLabel("Label Name");
        // create a mouse listener to the area of the label
        label.addMouseListener(this);
//        label.setBounds(0,0,100,100);  // set bounds when not using a layout manager
        label.setBackground(Color.RED);
        label.setOpaque(true);

        burger = new ImageIcon("burger.png");
        fries = new ImageIcon("fries.png");
        pizza = new ImageIcon("pizza.png");

        // set default image
        label.setIcon(burger);

//        this.pack();
        this.setLocationRelativeTo(null);       // this will have your frame appear in the center of your computer screen
        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        System.out.println("you clicked on this label");
        label.setIcon(burger);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        System.out.println("you pressed a mouse button on this label");
        label.setIcon(fries);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        System.out.println("you released a mouse button on this label");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // invoked when the mouse enters a component
        System.out.println("your mouse entered the area of this label");
        label.setBackground(Color.BLUE);
        label.setIcon(pizza);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        System.out.println("your mouse left the area of this label");
        label.setBackground(Color.RED);
        label.setIcon(burger);
    }
}
