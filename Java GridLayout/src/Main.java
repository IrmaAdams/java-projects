import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Layout Manager = Defines the natural layout for components within a container

        // GridLayout =     places components in a grid of cells.
        //                  Each component takes all the available space within its cell,
        //                  and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(2,2,10,10));

        JButton button1 = new JButton("1");
        frame.add(button1);
        JButton button2 = new JButton("2");
        frame.add(button2);
        JButton button3 = new JButton("3");
        frame.add(button3);
        JButton button4 = new JButton("4");
        frame.add(button4);

        frame.setVisible(true);
    }
}