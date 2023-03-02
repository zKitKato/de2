package MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    private JButton testButton;
    private JPanel  gridPanel;
    public MainFrame() {
        setTitle("Menue");
        setSize(600, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        getContentPane().add(gridPanel);

        testButton = new JButton("Button 1");
        testButton = new JButton("Button 2");

        gridPanel = new JPanel(new GridLayout(3,2,10,10));
        gridPanel.add(testButton);
        gridPanel.add(testButton);
    }
    public void actionPerformed(ActionEvent e) {

    }
}
