import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo extends JFrame implements ChangeListener {
    // declare global objects
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){

        frame = new JFrame("Slider Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,300));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.ITALIC,12));
        label.setFont(new Font("MV Boli",Font.ITALIC,20));

        //slider.setOrientation(JSlider.VERTICAL);
        slider.setOrientation(SwingConstants.VERTICAL);

        // add label
        label.setText("°C = "+slider.getValue());

        // add listener
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(450,480);
        frame.setVisible(true);


    }


    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("°C = "+slider.getValue());
    }
}
