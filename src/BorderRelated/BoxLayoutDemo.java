package BorderRelated;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private BoxLayout box;

    BoxLayoutDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 350, 300);
        this.setTitle("Box Layout Demo");

        c = this.getContentPane();

        // BoxLayout (Container c , int axis)
        box = new BoxLayout(c, BoxLayout.X_AXIS);  //(BoxLayout.X_AXIS or BoxLayout.Y_AXIS )
        c.setLayout(box);
        c.setBackground(Color.red);

        btn1 = new JButton("1");
        btn2 = new JButton("3");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        c.add(btn1);
        c.add(Box.createHorizontalStrut(10));
        c.add(btn2);
        c.add(Box.createHorizontalStrut(10));
        c.add(btn3);
        c.add(Box.createHorizontalStrut(10));
        c.add(btn4);
        c.add(Box.createHorizontalStrut(10));
        c.add(btn5);

    }

    public static void main(String[] args) {

        BoxLayoutDemo frame = new BoxLayoutDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
