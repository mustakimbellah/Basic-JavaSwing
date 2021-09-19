package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordFielDemo extends JFrame {

    private Container c;
    private JPasswordField pf;
    private Font f;

    PasswordFielDemo() {
        initcomponents();
    }

    private void initcomponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);

        
        f = new Font("Arial", Font.BOLD,22);
        
        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(50, 20, 150, 50);
        pf.setForeground(Color.red);
        pf.setBackground(Color.PINK);
        pf.setFont(f);
        c.add(pf);
    }

    public static void main(String[] args) {

        PasswordFielDemo frame = new PasswordFielDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);

        frame.setTitle("Password Fiel Demo");
        frame.setResizable(false);

    }
}
