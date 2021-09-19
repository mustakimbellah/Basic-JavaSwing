package StudentManagementProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends JFrame implements ActionListener {

    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    private Container c;
    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gpaLabel;
    private JTextField fnTf, InTf, phoneTf, gpaTf;
    private JButton addButton, updateButton, deleteButton, clearButtton;

    private String[] columns = {"Frist name ", "Last name", "Phone number", "GPA"};
    private String[] rows = new String[4];

    StudentTable() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(780, 690);
        this.setLocationRelativeTo(null);
        this.setTitle("Student Table Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        Font font = new Font("Arial", Font.BOLD, 16);

        // Title part...
        titleLabel = new JLabel("Student Registration");
        titleLabel.setFont(font);
        titleLabel.setBounds(140, 10, 250, 50);
        c.add(titleLabel);

        // Frist Name part...
        fnLabel = new JLabel("Frist Name  ");
        fnLabel.setFont(font);
        fnLabel.setBounds(10, 80, 140, 30);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(110, 80, 200, 30);
        fnTf.setFont(font);
        c.add(fnTf);

        addButton = new JButton("ADD");
        addButton.setBounds(400, 80, 100, 30);
        addButton.setFont(font);
        c.add(addButton);

        //second Part..........
        lnLabel = new JLabel("Last Name  ");
        lnLabel.setFont(font);
        lnLabel.setBounds(10, 130, 150, 30);
        c.add(lnLabel);

        InTf = new JTextField();
        InTf.setBounds(110, 130, 200, 30);
        InTf.setFont(font);
        c.add(InTf);

        updateButton = new JButton("Update");
        updateButton.setBounds(400, 130, 100, 30);
        updateButton.setFont(font);
        c.add(updateButton);

        // third Part...
        phoneLabel = new JLabel("PHONE  ");
        phoneLabel.setFont(font);
        phoneLabel.setBounds(10, 180, 150, 30);
        c.add(phoneLabel);

        phoneTf = new JTextField();
        phoneTf.setBounds(110, 180, 200, 30);
        phoneTf.setFont(font);
        c.add(phoneTf);

        deleteButton = new JButton("DELETE");
        deleteButton.setBounds(400, 180, 100, 30);
        deleteButton.setFont(font);
        c.add(deleteButton);

        //four part......
        gpaLabel = new JLabel("GPA  ");
        gpaLabel.setFont(font);
        gpaLabel.setBounds(10, 230, 150, 30);
        c.add(gpaLabel);

        gpaTf = new JTextField();
        gpaTf.setBounds(110, 230, 200, 30);
        gpaTf.setFont(font);
        c.add(gpaTf);

        clearButtton = new JButton("Clear");
        clearButtton.setBounds(400, 230, 100, 30);
        clearButtton.setFont(font);
        c.add(clearButtton);

        // table creat..
        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);

        scroll = new JScrollPane(table);
        scroll.setBounds(10, 360, 740, 265);
        c.add(scroll);

        addButton.addActionListener(this);
        clearButtton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);

        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me) {

                int numberofRow = table.getSelectedRow();

                String f_name = model.getValueAt(numberofRow, 0).toString();
                String l_name = model.getValueAt(numberofRow, 1).toString();
                String phone = model.getValueAt(numberofRow, 2).toString();
                String gpa = model.getValueAt(numberofRow, 3).toString();

                fnTf.setText(f_name);
                InTf.setText(l_name);
                phoneTf.setText(phone);
                gpaTf.setText(gpa);
            }

        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {

            rows[0] = fnTf.getText();
            rows[1] = InTf.getText();
            rows[2] = phoneTf.getText();
            rows[3] = gpaTf.getText();
            model.addRow(rows);

        } else if (e.getSource() == clearButtton) {

            fnTf.setText("");
            InTf.setText("");
            phoneTf.setText("");
            gpaTf.setText("");

        } else if (e.getSource() == deleteButton) {

            int numberofRow = table.getSelectedRow();
            if (numberofRow >= 0) {
                model.removeRow(numberofRow);
            } else {
                JOptionPane.showMessageDialog(null, "no row has been seleted or no row exits");
            }

        } else if (e.getSource() == updateButton) {

            int numberofRow = table.getSelectedRow();

            String f_name = fnTf.getText();
            String l_name = InTf.getText();
            String phone = phoneTf.getText();
            String gpa = gpaTf.getText();

            model.setValueAt(f_name, numberofRow, 0);
            model.setValueAt(l_name, numberofRow, 1);
            model.setValueAt(phone, numberofRow, 2);
            model.setValueAt(gpa, numberofRow, 3);
        }

    }

    public static void main(String[] args) {

        StudentTable frame = new StudentTable();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
