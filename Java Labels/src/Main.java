import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {

        // JLabel =     a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("rose.jpeg");
        Border border = BorderFactory.createLineBorder(Color.RED,5);           // set border type, colour and width

        JLabel label = new JLabel();            // create instance of label
        label.setText("Hello Lovelies!!");      // set label text
        label.setIcon(image);                   // set icon/image

        label.setHorizontalTextPosition(JLabel.CENTER);     // text placement (horizontal)
        label.setVerticalTextPosition(JLabel.TOP);          // text placement (vertical)

        label.setForeground(Color.RED);                                        // set font colour
        label.setFont(new Font("MV Boli", Font.ITALIC,20));         // set font, style and size

        label.setIconTextGap(10);               // set gap of text to image

        label.setBackground(Color.BLACK);       // set background colour - have to set label opacity for this to take effect
        label.setOpaque(true);                  // set label opacity to true

        label.setBorder(border);                // set border

        label.setVerticalAlignment(JLabel.CENTER);          // set vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER);        // set horizontal position of icon and text within label


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(800,800);

        // manually set size and placement of the label
//        frame.setLayout(null);
//        label.setBounds(50,25,700,700);


        frame.setVisible(true);

        // add label to the frame:
        frame.add(label);

        frame.pack();           // frame pack sets frame size to label size




    }
}