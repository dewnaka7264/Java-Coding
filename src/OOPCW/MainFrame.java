package OOPCW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame() {
        // Set up the main JFrame
        setTitle("Main Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton openButton = new JButton("Open New Window");

        // Add ActionListener to the button
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call a method to open the new JFrame
                openNewWindow();
            }
        });

        // Add the button to the main JFrame
        getContentPane().add(openButton);

        // Set layout manager (in this case, using the default FlowLayout)
        setLayout(new java.awt.FlowLayout());
    }

    private void openNewWindow() {
        // Create a new JFrame
        JFrame newFrame = new JFrame("New Window");

        // Set size, default close operation, and other properties of the new JFrame
        newFrame.setSize(300, 200);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Add some components to the new JFrame if needed

        // Make the new JFrame visible
        newFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the main JFrame
        MainFrame mainFrame = new MainFrame();

        // Make the main JFrame visible
        mainFrame.setVisible(true);
    }
}
