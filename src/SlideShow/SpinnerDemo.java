package SlideShow;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpinnerDemo extends JFrame implements ChangeListener {

    private Container c;
    private JSpinner spineer;
    private JLabel label;

    SpinnerDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 450, 450);
        this.setTitle("Spinner Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        SpinnerNumberModel value = new SpinnerNumberModel(10, 0, 30, 1);

        spineer = new JSpinner(value);
        spineer.setBounds(100, 100, 70, 50);
        c.add(spineer);

        label = new JLabel("Current Value : 10");
        label.setBounds(100, 200, 150, 50);
        c.add(label);

        spineer.addChangeListener(this);

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        String number = spineer.getValue().toString();
        int value = Integer.parseInt(number);
        label.setText("Current value : " + value);

    }

    public static void main(String[] args) {

        SpinnerDemo frame = new SpinnerDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
