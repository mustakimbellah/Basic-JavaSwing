package BorderRelated;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {

    private Container c;
    private JButton buttons[];
    private FlowLayout fLayout;

    FlowLayoutDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 350, 300);
        this.setTitle("Flow Layout Demo");

        c = this.getContentPane();

        fLayout = new FlowLayout(FlowLayout.LEFT, 10,15);
        c.setLayout(fLayout);

        buttons = new JButton[9];

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("" + (i + 1));
            c.add(buttons[i]);

        }

    }

    public static void main(String[] args) {

        FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setVisible(true);
        //frame.setResizable(false);
    }

}


