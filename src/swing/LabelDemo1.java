
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo1  extends JFrame{
    
    private Container c;
    private JLabel imgLabel ;
    private ImageIcon img;
   
    
    LabelDemo1()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        
        img = new ImageIcon(getClass().getResource("test.png"));
       
        imgLabel = new JLabel(img);
        imgLabel.setBounds(50, 30, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);
        
    }
    
    public static void main(String[] args) {
        
        LabelDemo1 frame = new LabelDemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 500);
        frame.setTitle("Label Demo");
        
    
}
}