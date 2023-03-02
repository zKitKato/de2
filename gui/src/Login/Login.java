package Login;

import MainFrame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import static MainFrame.MainFrame.*;
public class Login extends JFrame implements ActionListener {
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        userLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        userTextField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        add(userLabel);
        add(userTextField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);

        loginButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        char[] input = passwordField.getPassword();
        String password = new String(input);
        String username = userTextField.getText();

        if (username.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Welcome, " + username + "!", "Login Successful", JOptionPane.INFORMATION_MESSAGE);
            callingMenue();
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username or password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
    public boolean callingMenue(){
        return true;
    }
    public static void main(String[] args) throws InterruptedException{
        Login login = new Login();
        login.setVisible(true);
        MainFrame frame = new MainFrame();
        if (login.callingMenue()) {
            login.setVisible(false);
            frame.setVisible(true);
        }

    }
}
