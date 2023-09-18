import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    // declare JComboBox
    JComboBox comboBox;

    String[] animals = {"dog", "cat", "bird"};

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // initiate JComboBox

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        // methods available:
        comboBox.setEditable(true);
        System.out.println(comboBox.getItemCount());
        comboBox.addItem("butterfly");
        comboBox.insertItemAt("otter",3);
        comboBox.setSelectedIndex(0);
        System.out.println(comboBox.getItemCount());
        comboBox.removeItem("cat");
        System.out.println(comboBox.getItemCount());
        comboBox.removeItemAt(0);
        System.out.println(comboBox.getItemCount());
        comboBox.removeAllItems();
        System.out.println(comboBox.getItemCount());

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==comboBox){
            //System.out.println(comboBox.getSelectedIndex());

        }
    }
}
