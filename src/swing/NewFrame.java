package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewFrame extends JFrame {

    private Container c;
    private JLabel label;
    private Font f;

    NewFrame() {
        // initComponents();

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(400, 50, 400, 400);
        this.setTitle("New Frame Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f = new Font("Arival", Font.BOLD, 10);

        label = new JLabel(" Hello EveryOne Welcome to new Frame");
        label.setBounds(50, 50, 250, 50);
        label.setFont(f);
        c.add(label);
    }

    //public void initComponents() {
    // }
    public static void main(String[] args) {

        NewFrame fr = new NewFrame();
        fr.setVisible(true);

        // fr.setResizable(false);
    }

}
