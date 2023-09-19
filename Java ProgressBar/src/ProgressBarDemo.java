import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo{

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,500);

    ProgressBarDemo(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(bar);

        fill();
    }

    public void fill(){
        //bar.setValue(10);

        int counter = 500;
        //while(counter <=100){                     // counting from 0 to 100
        while(counter > 0){
            bar.setValue(counter);

            try {
                Thread.sleep(50);             // this will pause program after each iteration of the while loop
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter-=1;
        }
        bar.setString("Done!");
    }
}
