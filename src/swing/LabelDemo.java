
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LabelDemo extends JFrame{
    
    private Container c;
    private JLabel userLabel, passLabel;
    private Font f;
    
    LabelDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        f = new Font("Arial", Font.BOLD,14);
        
        
        userLabel = new JLabel();
        userLabel.setText("Enter your username : ");
        userLabel.setBounds(50, 20, 200, 50);
        userLabel.setFont(f);
        userLabel.setForeground(Color.RED);
        userLabel.setBackground(Color.blue);
        userLabel.setOpaque(true);
        userLabel.setToolTipText("Enter your username");
        c.add(userLabel);
        
        passLabel = new JLabel("Enter your password : ");
        passLabel.setBounds(50, 80, 200, 50);
        passLabel.setFont(f);
        passLabel.setForeground(Color.RED);
        passLabel.setBackground(Color.blue);
        passLabel.setOpaque(true);
        c.add(passLabel);
    }
    
    public static void main(String[] args) {
        
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("Label Demo");
        
    }
    
}
