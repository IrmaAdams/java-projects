import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    // create radio buttons:
    JRadioButton pizzaButton;
    JRadioButton burgerButton;
    JRadioButton friesButton;

    // create image icons for each button:
    ImageIcon pizzaIcon;
    ImageIcon burgerIcon;
    ImageIcon friesIcon;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // instantiating icons:
        pizzaIcon = new ImageIcon("pizza.png");
        burgerIcon = new ImageIcon("burger.png");
        friesIcon = new ImageIcon("fries.png");

        // instantiating radio buttons:
        pizzaButton = new JRadioButton("Pizza");
        burgerButton = new JRadioButton("Burger");
        friesButton = new JRadioButton("Fries");

        // add an icon to a button:
        pizzaButton.setIcon(pizzaIcon);
        burgerButton.setIcon(burgerIcon);
        friesButton.setIcon(friesIcon);

        // add all the buttons to one group:
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(friesButton);

        // add action listeners to each button:
        pizzaButton.addActionListener(this);
        burgerButton.addActionListener(this);
        friesButton.addActionListener(this);

        // add buttons to the JFrame:
        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(friesButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered Pizza!");
        } else if (e.getSource() == burgerButton) {
            System.out.println("You ordered a Burger!");
        } else if (e.getSource() == friesButton) {
            System.out.println("You ordered Fries!");
        } else {
            System.out.println("Please place your order");
        }
    }
}
