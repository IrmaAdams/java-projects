import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //  Layout Manager =    Defines the natural layout for components within a container

        //  FlowLayout =        places components in a row, sized at their preferred size.
        //                      If the horizontal space in the container is too small,
        //                      the FlowLayout class uses the next available row.

        // create a JFrame:
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(/*set alignment and spacing:*/ FlowLayout.CENTER,10,5));      // default layout = border layout. default alignment = center

        // create panel:
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        // create buttons:
//        JButton button1 = new JButton();
//        JButton button2 = new JButton();
//        JButton button3 = new JButton();
//        JButton button4 = new JButton();
//        JButton button5 = new JButton();
//        JButton button6 = new JButton();
//        JButton button7 = new JButton();
//        JButton button8 = new JButton();
//        JButton button9 = new JButton();

        // shortcut to creating buttons:
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);             // set visibility to true after adding components


    }
}