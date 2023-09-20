import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenuItem settingsItem;
    JMenuItem customerServiceItem;
    JMenuItem homeItem;
    JMenuItem helpItem;
    ImageIcon settingsIcon;
    ImageIcon customerServiceIcon;
    ImageIcon homeIcon;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        settingsIcon = new ImageIcon("settings.jpeg");
        customerServiceIcon = new ImageIcon("service.jpeg");
        homeIcon = new ImageIcon("home.jpeg");

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu settingsMenu = new JMenu("Settings");
        JMenu helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        settingsItem = new JMenuItem("Settings");
        customerServiceItem = new JMenuItem("Customer Service");
        homeItem = new JMenuItem("Home");
        helpItem = new JMenuItem("Help");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        settingsItem.addActionListener(this);
        customerServiceItem.addActionListener(this);
        homeItem.addActionListener(this);
        helpItem.addActionListener(this);

        // adding keyboard shortcuts to menu items:
        fileMenu.setMnemonic(KeyEvent.VK_F);            // Alt+F for file
        settingsMenu.setMnemonic(KeyEvent.VK_S);        // Alt+S for settings
        helpMenu.setMnemonic(KeyEvent.VK_H);            // Alt+H for help
        loadItem.setMnemonic(KeyEvent.VK_L);            // L for load
        saveItem.setMnemonic(KeyEvent.VK_S);            // S for save
        exitItem.setMnemonic(KeyEvent.VK_E);            // E for exit
        homeItem.setMnemonic(KeyEvent.VK_H);            // H for home

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        settingsItem.setIcon(settingsIcon);
        customerServiceItem.setIcon(customerServiceIcon);
        homeItem.setIcon(homeIcon);

        settingsMenu.add(settingsItem);
        settingsMenu.add(customerServiceItem);
        settingsMenu.add(homeItem);

        helpMenu.add(helpItem);

        menuBar.add(fileMenu);
        menuBar.add(settingsMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==loadItem){
            System.out.println("Loading item...");
        } else if (e.getSource()==saveItem) {
            System.out.println("Saving item...");
        } else if (e.getSource()==exitItem) {
            System.exit(0);
        } else if (e.getSource()==settingsItem) {
            System.out.println("Opening Settings..");
        } else if (e.getSource()==customerServiceItem) {
            System.out.println("Contacting Customer Services...");
        } else if (e.getSource()==homeItem) {
            System.out.println("Loading Home Page...");
        } else if (e.getSource()==helpItem) {
            System.out.println("Opening Help Page...");
        }


    }
}
