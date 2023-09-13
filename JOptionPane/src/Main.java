import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // JOptionPane =    a pop-up standard dialog box that prompts users for a value
        //                  or informs them of something.

        //JOptionPane.showMessageDialog(null, "This is a plain message", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is an information message", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a Question message", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a warning message", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is an error message", "title", JOptionPane.ERROR_MESSAGE);

        //System.out.println(JOptionPane.showConfirmDialog(null,"Do you code?", "Title", JOptionPane.YES_NO_CANCEL_OPTION));
        //int answer = JOptionPane.showConfirmDialog(null,"Do you code?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);

        //JOptionPane.showInputDialog("What is your name?");

//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello "+name);

        String[] responses = {"No, you're awesome!", "Thank you", "*Blush*"};
        ImageIcon icon = new ImageIcon("smiley.jpeg");
        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "Secret Message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);

    }
}