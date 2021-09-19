package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AnotherMethodForAddingListener extends JFrame implements ActionListener {

    private Container c;
    private JButton redButton, greenButton, BlueButton;

    AnotherMethodForAddingListener() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("Another Method For Adding Listener Demo");

        c = this.getContentPane();
        c.setLayout(null);

        redButton = new JButton("RED");
        redButton.setBounds(50, 50, 100, 50);
        c.add(redButton);

        greenButton = new JButton("GREEN");
        greenButton.setBounds(50, 110, 100, 50);
        c.add(greenButton);

        BlueButton = new JButton("BLUE");
        BlueButton.setBounds(50, 170, 100, 50);
        c.add(BlueButton);

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        BlueButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() ==redButton)
        {
            c.setBackground(Color.red);
        }
        else if(e.getSource() ==greenButton)
        {
            c.setBackground(Color.GREEN);
        }
        else
        {
             c.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {

        AnotherMethodForAddingListener frame = new AnotherMethodForAddingListener();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
