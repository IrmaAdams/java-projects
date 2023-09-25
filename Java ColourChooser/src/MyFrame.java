import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a Colour");
        button.addActionListener(this);

        label = new JLabel("");
        label.setBackground(Color.WHITE);
        label.setFont(new Font("MV Boli",Font.ITALIC,50));
        label.setText("Your Colour :D");
        label.setOpaque(true);


        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();

            Color colour = JColorChooser.showDialog(null, "Pick a colour...", Color.BLACK);

            label.setForeground(colour);
        }
    }
}
