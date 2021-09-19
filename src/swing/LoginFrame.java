package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    
    private Container c;
    private JLabel userLabel, passLabel;
    private JPasswordField pf;
    private JButton loginButton, clearButton;
    private JTextField tf;
    private Font f;
    
    LoginFrame() {
        initComponents();
    }
    
    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        f = new Font("Arival", Font.BOLD, 18);
        
        userLabel = new JLabel("Username : ");
        userLabel.setBounds(50, 50, 150, 50);
        userLabel.setFont(f);
        c.add(userLabel);
        
        tf = new JTextField();
        tf.setBounds(170, 50, 200, 50);
        tf.setFont(f);
        c.add(tf);
        
        passLabel = new JLabel("Password : ");
        passLabel.setBounds(50, 120, 150, 50);
        passLabel.setFont(f);
        c.add(passLabel);
        
        pf = new JPasswordField();
        pf.setBounds(170, 120, 200, 50);
        pf.setFont(f);
        c.add(pf);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(170, 190, 90, 50);
        loginButton.setFont(f);
        c.add(loginButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(280, 190, 90, 50);
        clearButton.setFont(f);
        c.add(clearButton);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String userName = tf.getText();
                String password = pf.getText();
                
                if (userName.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "You are Successfully logined");
                    dispose();
                    NewFrame fr = new NewFrame();
                    fr.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invaid UserName Or Password");
                }
                
            }
            
        });
        
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                tf.setText("");
                pf.setText("");
                
            }
            
        });
        
    }
    
    public static void main(String[] args) {
        
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 420, 350);
        frame.setTitle("Login Demo");
        frame.setResizable(false);
    }
    
}
