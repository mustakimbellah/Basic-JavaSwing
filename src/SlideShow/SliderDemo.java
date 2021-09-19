package SlideShow;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo extends JFrame implements ChangeListener {

    private Container c;
    private JLabel redLabel, greenLabel, blueLabel, previewLabel;
    private JSlider redSlider, greenSlider, blueSlider;
    private JTextField redtf, greentf, bluetf;
    private JPanel panel;

    SliderDemo() {
        initComponents();
    }

    public void initComponents() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 350);
        this.setTitle("Slider Demo");

        c = this.getContentPane();
        c.setLayout(null);

        redLabel = new JLabel("RED");
        redLabel.setBounds(50, 50, 80, 50);
        c.add(redLabel);

        redSlider = new JSlider(0, 255, 0);
        redSlider.setBounds(90, 50, 300, 50);
        c.add(redSlider);

        redtf = new JTextField();
        redtf.setHorizontalAlignment(JTextField.CENTER);
        redtf.setBounds(400, 50, 80, 40);
        c.add(redtf);

        greenLabel = new JLabel("GREEN");
        greenLabel.setBounds(50, 110, 80, 50);
        c.add(greenLabel);

        greenSlider = new JSlider(0, 255, 0);
        greenSlider.setBounds(90, 110, 300, 50);
        c.add(greenSlider);

        greentf = new JTextField();
        greentf.setHorizontalAlignment(JTextField.CENTER);
        greentf.setBounds(400, 110, 80, 40);
        c.add(greentf);

        blueLabel = new JLabel("BLUE");
        blueLabel.setBounds(50, 170, 80, 50);
        c.add(blueLabel);

        blueSlider = new JSlider(0, 255, 0);
        blueSlider.setBounds(90, 170, 300, 50);
        c.add(blueSlider);

        bluetf = new JTextField();
        bluetf.setHorizontalAlignment(JTextField.CENTER);
        bluetf.setBounds(400, 170, 80, 40);
        c.add(bluetf);

        panel = new JPanel();
        panel.setBounds(550, 50, 200, 160);
        panel.setBackground(Color.PINK);
        c.add(panel);

        previewLabel = new JLabel("PREVIEW");
        previewLabel.setBounds(630, 200, 100, 50);
        c.add(previewLabel);

        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        int redValue = redSlider.getValue();
        int greenValue = greenSlider.getValue();
        int blueValue = blueSlider.getValue();

        redtf.setText("" + redValue);
        greentf.setText("" + greenValue);
        bluetf.setText("" + blueValue);

        Color color = new Color(redValue, greenValue, blueValue);
        panel.setBackground(color);

    }

    public static void main(String[] args) {

        SliderDemo frame = new SliderDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
