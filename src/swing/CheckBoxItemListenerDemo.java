package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemListenerDemo extends JFrame {

    private Container c;
    private JCheckBox javaCheckBox, cCheckBox, mysqlCheckBox;
    private Font f;
    private ButtonGroup grp;
    private JLabel label;

    CheckBoxItemListenerDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 500, 400);
        this.setTitle("CheckBoxItemListener Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        f = new Font("Arial", Font.BOLD, 18);

        grp = new ButtonGroup();

        javaCheckBox = new JCheckBox("Java");
        javaCheckBox.setBounds(50, 100, 100, 30);
        javaCheckBox.setBackground(Color.pink);
        javaCheckBox.setFont(f);
        c.add(javaCheckBox);

        cCheckBox = new JCheckBox("C");
        cCheckBox.setBounds(50, 130, 100, 30);
        cCheckBox.setBackground(Color.pink);
        cCheckBox.setFont(f);
        c.add(cCheckBox);

        mysqlCheckBox = new JCheckBox("MYSQL");
        mysqlCheckBox.setBounds(50, 160, 100, 30);
        mysqlCheckBox.setBackground(Color.pink);
        mysqlCheckBox.setFont(f);
        c.add(mysqlCheckBox);

        grp.add(javaCheckBox);
        grp.add(cCheckBox);
        grp.add(mysqlCheckBox);

        label = new JLabel("you havent selected anything");
        label.setBounds(50, 200, 300, 30);
        label.setFont(f);
        c.add(label);

        Handler handler = new Handler();

        javaCheckBox.addItemListener(handler);
        cCheckBox.addItemListener(handler);
        mysqlCheckBox.addItemListener(handler);

    }

    class Handler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {

            if (e.getSource() == javaCheckBox) {
                label.setText("You have Select java");
            } else if (e.getSource() == cCheckBox) {
                label.setText("You have Select c");
            } else {
                label.setText("You have Select mysql");
            }
        }
    }

    public static void main(String[] args) {

        CheckBoxItemListenerDemo frame = new CheckBoxItemListenerDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
