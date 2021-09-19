package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCounterDemo extends JFrame {

    private Container c;
    private JLabel promptLabel, vowelLabel, aLabel, eLabel, iLabel, oLabel, uLabel;
    private JTextArea inputTextArea;
    private JScrollPane scroll;

    int totalVowel = 0;

    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_o = 0;
    int letter_u = 0;

    VowelCounterDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("Vowel Counter Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        promptLabel = new JLabel("Enter the Text : ");
        promptLabel.setBounds(10, 20, 100, 30);
        c.add(promptLabel);

        inputTextArea = new JTextArea();
        inputTextArea.setWrapStyleWord(true);
        inputTextArea.setLineWrap(true);

        scroll = new JScrollPane(inputTextArea);
        scroll.setBounds(110, 20, 450, 100);
        c.add(scroll);

        vowelLabel = new JLabel();
        vowelLabel.setBounds(110, 150, 150, 30);
        c.add(vowelLabel);

        aLabel = new JLabel();
        aLabel.setBounds(110, 190, 150, 30);
        c.add(aLabel);

        eLabel = new JLabel();
        eLabel.setBounds(110, 230, 150, 30);
        c.add(eLabel);

        iLabel = new JLabel();
        iLabel.setBounds(110, 270, 150, 30);
        c.add(iLabel);

        oLabel = new JLabel();
        oLabel.setBounds(110, 310, 150, 30);
        c.add(oLabel);

        uLabel = new JLabel();
        uLabel.setBounds(110, 350, 150, 30);
        c.add(uLabel);

        inputTextArea.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getSource() == inputTextArea) {
                    
                    if (e.VK_A == e.getKeyCode()) {
                        letter_a++;
                        totalVowel++;
                    }if (e.VK_E == e.getKeyCode()) {
                        letter_e++;
                        totalVowel++;
                    }if (e.VK_I == e.getKeyCode()) {
                        letter_i++;
                        totalVowel++;
                    }if (e.VK_O == e.getKeyCode()) {
                        letter_o++;
                        totalVowel++;
                    } if(e.VK_U == e.getKeyCode()){
                        letter_u++;
                        totalVowel++;
                    }

                }

                vowelLabel.setText("Total Number of vowels : " + totalVowel);
                aLabel.setText("Total Number of a : " + letter_a);
                eLabel.setText("Total Number of e : " + letter_e);
                iLabel.setText("Total Number of i : " + letter_i);
                oLabel.setText("Total Number of o : " + letter_o);
                uLabel.setText("Total Number of u : " + letter_u);

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        }
        );

    }

    public static void main(String[] args) {

        VowelCounterDemo frame = new VowelCounterDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
