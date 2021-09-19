
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaDemo extends JFrame{
    
    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane scroll;
    
    
    TextAreaDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        f= new Font("Arial", Font.BOLD,18);
        
        ta = new JTextArea();
        
        ta.setFont(f);
        ta.setForeground(Color.red);
        ta.setBackground(Color.MAGENTA);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
       
        
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(50, 50, 300, 200);
        c.add(scroll);
    }
    
    
    public static void main(String[] args) {
        TextAreaDemo frame = new TextAreaDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("Text Area Demo");
        frame.setResizable(false);
        
    }
    
}
