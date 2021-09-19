package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionDemo2 extends JFrame {

    private Container c;
    private JTextField tf1, tf2;

    ActionDemo2() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 110, 150, 50);
        c.add(tf2);

        Handler handler = new Handler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);

    }

    class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == tf1) {
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "you didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1 = " + s);
                }

            } else {
                String s = tf2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "you didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2 = " + s);
                }
            }

        }

    }

    public static void main(String[] args) {

        ActionDemo1 frame = new ActionDemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 400, 300);

        frame.setTitle("ActionListener Demo");
        frame.setResizable(false);

    }
}
