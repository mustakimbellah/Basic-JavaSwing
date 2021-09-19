
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameDemo extends JFrame {
    
    private ImageIcon icon;
    private Container c;
    
    FrameDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        
        icon = new ImageIcon(getClass().getResource("icon.jpg"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        
        FrameDemo frame = new FrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        
        frame.setTitle("Freme Demo");
        frame.setResizable(false);
    }
    
}
