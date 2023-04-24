

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Pharmacist extends javax.swing.JFrame {

    private JLabel jLabel10;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;

    public Pharmacist() {
        super("Welcome to Sanjeevani");
        initComponents();
        jLabel10.setText("Welcome " + "Pharmacist");

        String[][] medicineData = {
                {"Medicine", "Stock", "Expiry Date"},
                {"Medicine 1", "50", "2023-06-30"},
                {"Medicine 2", "30", "2023-07-15"},
                {"Medicine 3", "20", "2023-08-05"},
                {"Medicine 4", "10", "2023-09-10"},
                {"Medicine 5", "40", "2023-07-31"},
                {"Medicine 6", "25", "2023-08-20"},
                {"Medicine 7", "15", "2023-09-05"},
                {"Medicine 8", "5", "2023-10-10"},
                {"Medicine 9", "35", "2023-08-15"},
                {"Medicine 10", "20", "2023-09-25"},
                {"Medicine 11", "30", "2023-07-30"},
                {"Medicine 12", "15", "2023-08-10"},
                {"Medicine 13", "10", "2023-09-20"},
                {"Medicine 14", "25", "2023-07-25"},
                {"Medicine 15", "20", "2023-08-30"},
                {"Medicine 16", "5", "2023-09-10"},
                {"Medicine 17", "30", "2023-07-31"},
                {"Medicine 18", "15", "2023-08-15"},
                {"Medicine 19", "10", "2023-09-30"},
                {"Medicine 20", "20", "2023-07-15"},
        };
        String[] medicineColumns = {"Medicine", "Stock", "Expiry Date"};
        jTable1.setModel(new DefaultTableModel(medicineData, medicineColumns));
    }

    private void initComponents() {
        jLabel10 = new JLabel();
        jLabel2 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(true);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setBounds(10, 10, 370, 20);
        getContentPane().add(jLabel10);

        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setBounds(10, 40, 780, 260);
        getContentPane().add(jScrollPane1);

        jLabel2.setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().add(jLabel2);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacist().setVisible(true);
            }
        });
    }

}
