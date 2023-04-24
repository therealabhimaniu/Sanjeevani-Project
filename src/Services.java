import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class Services extends JFrame {
    private JTable jTable1;
    private JButton jButton1;
    private JButton jButton2;
    private JScrollPane jScrollPane1;

    public Services() {
        super("List of Services Provided");
        initComponents();
        jButton1.setBackground(Color.yellow);
        jButton2.setBackground(Color.yellow);
    }

    private void initComponents() {
        Container container = getContentPane();
        container.setLayout(null);

        jTable1 = new JTable(new Object[][] { { "Cancer Center", "800" }, { "Dentistry ", "700" },
                { "Dermatology", "600" }, { "Diabetes", "600" }, { "Rehabilitation Center", "800" },
                { "Pediatric Cardiologist", "600" }, { "Pediatrictian", "50" }, { "Respiratory Care Center", "600" },
                { "Reproductive Care Center", "700" }, { "Skin Care Center", "500" }, { "Sleep Care Center", "600" },
                { "Spine Therapy", "500" }, { "Surgical Services", "800" }, { "Transplant Center", "100" },
                { "Weight Management Center", "700" } }, new String[] { "Service", "Appointment Cost in Rs" });
        jTable1.setBounds(60, 130, 500, 270);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setShowHorizontalLines(false);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.setShowVerticalLines(false);
        jTable1.setShowGrid(false);
        jTable1.setFillsViewportHeight(true);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setBackground(new Color(255, 255, 255));
        jTable1.setCellSelectionEnabled(true);
        container.add(jTable1);

        jButton1 = new JButton("BOOK APPOINTMENT");
        jButton1.setBounds(60, 420, 100, 30);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Button 1 action
            }
        });
        container.add(jButton1);

        jButton2 = new JButton("CHECK APPOINTMENT");
        jButton2.setBounds(180, 420, 100, 30);
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Button 2 action
            }
        });
        container.add(jButton2);

        jScrollPane1 = new JScrollPane(jTable1);
        jScrollPane1.setBounds(60, 130, 500, 170);
        container.add(jScrollPane1);

        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Services().setVisible(true);
            }
        });
    }
}
