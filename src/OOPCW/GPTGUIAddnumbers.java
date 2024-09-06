package OOPCW;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPTGUIAddnumbers {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Add Two Numbers");

        JPanel panel = new JPanel();

        JLabel label1 = new JLabel("Number 1:");
        JTextField textField1 = new JTextField(10);

        JLabel label2 = new JLabel("Number 2:");
        JTextField textField2 = new JTextField(10);

        JButton addButton = new JButton("Add");

        JLabel resultLabel = new JLabel("Result:");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());

                    int result = num1 + num2;

                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter integers.");
                }
            }
        });

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(addButton);
        panel.add(resultLabel);

        frame.getContentPane().add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
