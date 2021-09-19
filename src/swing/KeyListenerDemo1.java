package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyListenerDemo1 extends JFrame {

    private Container c;
    private JTextField tf;
    private JTextArea ta;

    KeyListenerDemo1() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 500);
        this.setTitle("Key Listener Demo");

        c = this.getContentPane();
        c.setLayout(null);

        tf = new JTextField();
        tf.setBounds(50, 50, 150, 50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBounds(10, 110, 300, 300);
        ta.setBackground(Color.pink);
        c.add(ta);

        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

                ta.append("Key Type : " + e.getKeyChar() + "\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {

                ta.append("Key pressed : " + e.getKeyChar() + "\n");

            }

            @Override
            public void keyReleased(KeyEvent e) {

                ta.append("Key Released : " + e.getKeyChar() + "\n");

            }

        });
    }

    public static void main(String[] args) {

        KeyListenerDemo1 frame = new KeyListenerDemo1();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
