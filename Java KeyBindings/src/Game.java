import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {

    JFrame frame;
    JLabel label;

    // action object instances:
    // declare actions:
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game(){

        // setting up the frame:
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        // setting up the label:
        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        // instantiate the actions:
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        // with Swing components in Java, each component is able to have its own unique mapping of key events
        // to actions.  The label is a Swing component for example:
        // using the arrow keys:
        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        // using the awsd keys:
        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            // set a new location for the label:
            label.setLocation(label.getX(),label.getY()-10);
        }
    }

    public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            // set a new location for the label:
            label.setLocation(label.getX(),label.getY()+10);
        }
    }

    public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            // set a new location for the label:
            label.setLocation(label.getX()-10,label.getY());
        }
    }

    public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            // set a new location for the label:
            label.setLocation(label.getX()+10,label.getY());
        }
    }
}
