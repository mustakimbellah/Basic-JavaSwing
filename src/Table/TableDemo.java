package Table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo extends JFrame {

    private Container c;
    private JLabel label;
    private Font font;
    private JTable table;
    private JScrollPane scroll;
    private String[] cols = {"ID", "Name", "GPA"};
    private String[][] rows = {
        {"101", "Mustakim", "3.94"},
        {"102", "Pinky", "2.94"},
        {"103", "Suparna", "3.04"},
        {"104", "Numan", "3.24"},
        {"101", "Mustakim", "3.94"},
        {"102", "Pinky", "2.94"},
        {"103", "Suparna", "3.04"},
        {"104", "Numan", "3.24"},
        {"101", "Mustakim", "3.94"},
        {"102", "Pinky", "2.94"},
        {"103", "Suparna", "3.04"},
        {"104", "Numan", "3.24"},
        {"101", "Mustakim", "3.94"},
        {"102", "Pinky", "2.94"},
        {"103", "Suparna", "3.04"},
        {"104", "Numan", "3.24"},};

    TableDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 750, 450);
        this.setTitle("Table Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        font = new Font("Arial", Font.BOLD, 22);

        label = new JLabel("Student Details");
        label.setBounds(250, 20, 200, 50);
        label.setFont(font);
        c.add(label);

        table = new JTable(rows, cols);
        table.setSelectionBackground(Color.PINK);
        //table.setEnabled(false);

        scroll = new JScrollPane(table);
        scroll.setBounds(50, 80, 600, 150);
        c.add(scroll);

    }

    public static void main(String[] args) {

        TableDemo frame = new TableDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
