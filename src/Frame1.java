import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Frame1 extends JFrame {

    private JButton jButton2;

    public Frame1() {
        super("Welcome to Sanjeevani Hospital");
        initComponents();
    }

    private void initComponents() {

        jButton2 = new JButton("Click  Anywhere... or Press Enter");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());

        getContentPane().setBackground(Color.LIGHT_GRAY);
        jButton2.setPreferredSize(new Dimension(150, 50));

        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2);

        JLabel headingLabel = new JLabel("Sanjeevani");
        headingLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(headingLabel, BorderLayout.NORTH);

        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        Frame2 obj = new Frame2();
        obj.setVisible(true);
        this.dispose();
    }

    private void jButton2KeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Frame2 obj = new Frame2();
            obj.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String args[]) {
        Frame1 ob = new Frame1();
        ob.setVisible(true);
    }

}
