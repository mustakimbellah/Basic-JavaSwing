
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo2 extends JFrame {
    
     private Container c;
     private JLabel label;
     private ImageIcon image;

    LabelDemo2() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 50, 500, 400);
        this.setTitle("Label Demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);


        image = new ImageIcon(getClass().getResource("test.png"));
        
        label = new JLabel(" Keyboard",image,JLabel.RIGHT);
        label.setBounds(50, 50, 50, 50);
        c.add(label);
        

    }

    public static void main(String[] args) {

        LabelDemo2 frame = new LabelDemo2();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
