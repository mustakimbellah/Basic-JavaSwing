package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseMotionListenerDemo1 extends JFrame {

    private Container c;
    private JTextArea ta;
    private JTextField tf;

    MouseMotionListenerDemo1() {
        initComponents();
    }

    public void initComponents() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 400);
        this.setTitle("Mouse Motion Listener Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        ta = new JTextArea();
        ta.setBounds(10, 20, 200, 200);
        c.add(ta);
        
        tf = new JTextField();
        tf.setBounds(220, 20, 150, 50);
        c.add(tf);
        
        ta.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                
                tf.setText("mouse Dragged" + e.getX() + " "+ e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                
                tf.setText("mouse Moved "+ e.getX() + " "+ e.getY());
                
            }
            
            
        } );

    }

    public static void main(String[] args) {

        MouseMotionListenerDemo1 frame = new MouseMotionListenerDemo1();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}

