package toggleButtion;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class ToggleButtonDemo extends JFrame implements ActionListener {

    private Container c;
    private JToggleButton tb;
    private JLabel label;
    private ImageIcon onIcon, offIcon;

    ToggleButtonDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 300);
        this.setTitle("Toggle Button Demo");

        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);

        onIcon = new ImageIcon("src/image/on.jpg");
        offIcon = new ImageIcon("src/image/off.jpg");

        tb = new JToggleButton(offIcon);
        tb.setBounds(50, 50, 90, 90);
        c.add(tb);

        label = new JLabel("Hello There");
        label.setVisible(false);
        label.setBounds(50, 150, 150, 50);
        c.add(label);

        tb.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (tb.isSelected()) {
            
            tb.setIcon(onIcon);
            
           // tb.setText("ON");
            label.setVisible(true);
        } else {

             tb.setIcon(offIcon);
           // tb.setText("OFF");
            label.setVisible(false);
        }
    }

    public static void main(String[] args) {

        ToggleButtonDemo frame = new ToggleButtonDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
