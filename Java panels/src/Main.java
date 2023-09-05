import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JPanel = a GUI component that functions as a container to hold other components

        // create a label:
        // (after creating label, you can add it to frame or to panel)
        ImageIcon icon = new ImageIcon("thumbsUp.jpeg");
        JLabel label = new JLabel();
        label.setText("Cool!!");
        label.setIcon(icon);
        // i will add this label to the blue panel

        // create a JPanel:
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0,0,250,250); // after creating this panel, remember to add this to the frame below

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);

        // create a JFrame:
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);                  // not using a layout manager at this point
        frame.setSize(750,750);
        frame.setVisible(true);

        // adding label to blue panel:
        bluePanel.add(label);

        // add panel to frame:
        frame.add(bluePanel);
        frame.add(redPanel);
        frame.add(greenPanel);



    }
}