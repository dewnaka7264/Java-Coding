//package GUI;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class LoginRegisterDialog extends JDialog {
//
//    private JRadioButton loginRadioButton;
//    private JRadioButton registerRadioButton;
//    private JButton proceedButton;
//
//    public LoginRegisterDialog(JFrame parent) {
//        super(parent, "Choose Action", true);
//        setSize(300, 150);
//        setLocationRelativeTo(parent);
//
//        createUI();
//    }
//
//    private void createUI() {
//        JPanel panel = new JPanel(new GridLayout(3, 1));
//
//        loginRadioButton = new JRadioButton("Login");
//        registerRadioButton = new JRadioButton("Register");
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(loginRadioButton);
//        buttonGroup.add(registerRadioButton);
//
//        proceedButton = new JButton("Proceed");
//        proceedButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                handleProceed();
//            }
//        });
//
//        panel.add(loginRadioButton);
//        panel.add(registerRadioButton);
//        panel.add(proceedButton);
//
//        add(panel);
//    }
//
//    private void handleProceed() {
//        if (loginRadioButton.isSelected()) {
//            showLoginDialog();
//        } else if (registerRadioButton.isSelected()) {
//            showRegisterDialog();
//        } else {
//            JOptionPane.showMessageDialog(this, "Please choose an action.");
//        }
//    }
//
//    private void showLoginDialog() {
//        LoginDialog loginDialog = new LoginDialog(this);
//        loginDialog.setVisible(true);
//    }
//
//    private void showRegisterDialog() {
//        RegisterDialog registerDialog = new RegisterDialog(this);
//        registerDialog.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                JFrame frame = new JFrame();
//                frame.setSize(400, 300);
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//                JButton showDialogButton = new JButton("Show Login/Register Dialog");
//                showDialogButton.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        LoginRegisterDialog dialog = new LoginRegisterDialog(frame);
//                        dialog.setVisible(true);
//                    }
//                });
//
//                frame.add(showDialogButton);
//                frame.setVisible(true);
//            }
//        });
//    }
//}
//
//class LoginDialog extends JDialog {
//
//    public LoginDialog(JFrame parent) {
//        super(parent, "Login", true);
//        setSize(300, 150);
//        setLocationRelativeTo(parent);
//
//        // Add login components and logic here
//        // ...
//
//        JLabel label = new JLabel("This is the login dialog.");
//        add(label);
//    }
//}
//
//class RegisterDialog extends JDialog {
//
//    public RegisterDialog(JFrame parent) {
//        super(parent, "Register", true);
//        setSize(300, 150);
//        setLocationRelativeTo(parent);
//
//        // Add register components and logic here
//        // ...
//
//        JLabel label = new JLabel("This is the register dialog.");
//        add(label);
//    }
//}
//
