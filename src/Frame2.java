import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends JFrame {

    public Frame2() {
        super("Sanjeevani");
        initComponents();
    }

    private void initComponents() {
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(800, 900);

        jLabel2.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 36));
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Main Page");
        add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 22));
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Who are you ? .....");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel3);

        jButton1.setText("Patient");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Patient log = new Patient();
                log.setVisible(true);
                dispose();
            }
        });
        jButton1.setPreferredSize(new Dimension(200, 50));
        add(jButton1);

        jButton2.setText("Doctor");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Doctor l =  new Doctor();
                l.setVisible(true);
                dispose();
            }
        });
        jButton2.setPreferredSize(new Dimension(200, 50));
        add(jButton2);

        jButton3.setText("Pharmacist");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Pharmacist lg = new Pharmacist();
                lg.setVisible(true);
                dispose();
            }
        });
        jButton3.setPreferredSize(new Dimension(200, 50));
        add(jButton3);

        pack();
    }

    public static void main(String args[]) {
        Frame2 o = new Frame2();
        o.setVisible(true);
    }
}
