package BorderRelated;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardDemo extends JFrame implements ActionListener {

    private Container c;
    private CardLayout cl;
    private JButton btn1, btn2, btn3;

    CardDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 300, 300);
        this.setTitle("Card Demo");

        c = this.getContentPane();

        cl = new CardLayout();
        c.setLayout(cl);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");

        c.add(btn1, "frist");
        c.add(btn2, "seconf");
        c.add(btn3, "third");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        cl.next(c);
    }

    public static void main(String[] args) {

        CardDemo frame = new CardDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
