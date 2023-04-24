import javax.swing.*;
import java.awt.*;

public class Doctor extends JFrame {

    private JLabel jLabel10;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JTable jTable2;

    public Doctor() {
        super("Welcome to Sanjeevani");
        initComponents();
    }

    private void initComponents() {
        jLabel10 = new JLabel();
        jLabel2 = new JLabel();
        jLabel2.setPreferredSize(new java.awt.Dimension(800, 400));

        String[][] timetableData = {
                {"Monday", "9:00 AM", "5:00 PM", "Available"},
                {"Tuesday", "9:00 AM", "5:00 PM", "Available"},
                {"Wednesday", "9:00 AM", "5:00 PM", "Unavailable"},
                {"Thursday", "9:00 AM", "5:00 PM", "Available"},
                {"Friday", "9:00 AM", "5:00 PM", "Unavailable"}
        };
        String[] timetableColumns = {"Day", "Start Time", "End Time", "Availability"};
        jTable1 = new JTable(timetableData, timetableColumns);
        jScrollPane1 = new JScrollPane(jTable1);

        String[][] patientData = {
                {"Jay", "Doe", "25", "Male"},
                {"Jeni", "Smith", "35", "Female"},
                {"Ram", "Brown", "45", "Male"},
                {"Ramya", "Johnson", "30", "Female"},
                {"Anshu", "Lee", "40", "Male"},
                {"Sarah", "Williams", "28", "Female"},
                {"Sam", "Jones", "50", "Male"}
        };
        String[] patientColumns = {"First Name", "Last Name", "Age", "Gender"};
        jTable2 = new JTable(patientData, patientColumns);
        jScrollPane2 = new JScrollPane(jTable2);

        setLayout(new GridLayout(2, 1));
        add(jScrollPane1);
        add(jScrollPane2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }
}
