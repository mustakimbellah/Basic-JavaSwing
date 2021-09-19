package TabbedPane;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneDemo extends JFrame {

    private Container c;
    private JTabbedPane tp;
    private JPanel panel1,panel2,panel3;
    private JLabel label1,label2,label3;
    private ImageIcon homeIcon;

    TabbedPaneDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 450, 450);
        this.setTitle("Tabbed Pane Demo");

        c = this.getContentPane();
        c.setLayout(null);
        
        tp = new JTabbedPane();
        tp.setBounds(50, 50, 300, 300);
        c.add(tp);
        
        homeIcon = new ImageIcon("src/TabbedPane/homeIcon.png");
        
        label1 = new JLabel("THis is Label1");
        label2 = new JLabel("THis is Label2");
        label3 = new JLabel("THis is Label3");
        
        panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.red);
        
        panel2 = new JPanel();
        panel2.add(label2);
        panel2.setBackground(Color.BLUE);
        
        panel3 = new JPanel();
        panel3.add(label3);
        panel3.setBackground(Color.PINK);
        
        
        tp.addTab("HOME", panel1);
        tp.addTab("EDIT", panel2);
        tp.addTab("HELP", panel3);

    }

    public static void main(String[] args) {

        TabbedPaneDemo frame = new TabbedPaneDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
