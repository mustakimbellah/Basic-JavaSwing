package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame {

    private Container c;
    private JLabel imgLabel, textLabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton clearButton;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;

    Test() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial", Font.BOLD, 20);

        img = new ImageIcon(getClass().getResource("multi.png"));

        imgLabel = new JLabel(img);
        imgLabel.setBounds(20, 10, 200, 200);
        c.add(imgLabel);

        textLabel = new JLabel("Enter any Number : ");
        textLabel.setBounds(20, 200, 250, 50);
        textLabel.setForeground(Color.MAGENTA);
        textLabel.setFont(f);
        c.add(textLabel);

        tf = new JTextField();
        tf.setBounds(230, 200, 90, 50);
        tf.setBackground(Color.GREEN);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f);
        c.add(tf);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        clearButton = new JButton("Clear");
        clearButton.setBounds(230, 260, 90, 50);
        clearButton.setBackground(Color.GREEN);
        clearButton.setCursor(cursor);
        clearButton.setFont(f);
        c.add(clearButton);

        ta = new JTextArea();
        ta.setBounds(20, 350, 300, 300);
        ta.setBackground(Color.GREEN);
        ta.setFont(f);
        c.add(ta);

        tf.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String value = tf.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didnt put any number");
                } else {
                    ta.setText("");
                    int num = Integer.parseInt(tf.getText());

                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String incr = String.valueOf(i);

                        ta.append(n + " X " + incr + " = " + r + "\n");

                    }
                }

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ta.setText("");
            }

        });
    }

    public static void main(String[] args) {

        Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 20, 360, 700);
        frame.setTitle("Multiplication Table");
        frame.setResizable(false);
    }

}
