package SlideShow;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowDemo extends JFrame implements ActionListener {
    
    private Container c;
    private JPanel panel;
    private JButton prevButton, nextButton;
    private ImageIcon icon;
    private JLabel label;
    private CardLayout card;
    
    SlideShowDemo() {
        initComponents();
        showImage();
    }
    
    public void showImage() {
        
        String[] imageNames = {"1.png", "2.jpg", "3.jpg"};
        
        for (String n : imageNames) {
            
            icon = new ImageIcon("src/SlideShow.image/" + n);

            // image resize
            Image img = icon.getImage();
            Image newImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);
            label = new JLabel(icon);
            panel.add(label);
        }
        
    }
    
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("Slide Show Demo");
        
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        card = new CardLayout();
        
        panel = new JPanel(card);
        panel.setBounds(10, 10, 560, 380);
        c.add(panel);
        
        prevButton = new JButton("Previous");
        prevButton.setBounds(10, 400, 100, 50);
        c.add(prevButton);
        
        nextButton = new JButton("Next");
        nextButton.setBounds(470, 400, 100, 50);
        c.add(nextButton);
        
        prevButton.addActionListener(this);
        nextButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == prevButton) {
            card.previous(panel);
            
        }
        if (e.getSource() == nextButton) {
            card.next(panel);
        }
        
    }
    
    public static void main(String[] args) {
        
        SlideShowDemo frame = new SlideShowDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
}
