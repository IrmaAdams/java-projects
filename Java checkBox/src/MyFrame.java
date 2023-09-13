import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon check;
    ImageIcon cross;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        check = new ImageIcon("check.png");
        cross = new ImageIcon("x.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a Robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 25));
        checkBox.setIcon(cross);
        checkBox.setSelectedIcon(check);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }

    }
}
