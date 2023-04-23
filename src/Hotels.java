import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Hotels extends JFrame {
    private JTable table;
    private DefaultTableModel model;

    public Hotels() {
        super("Hotel List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create table with default table model
        model = new DefaultTableModel();
        table = new JTable(model);

        // Add columns to the table
        model.addColumn("Hotel Name");
        model.addColumn("Location");
        model.addColumn("Price");

        // Add predefined entries to the table
        model.addRow(new Object[]{"Grand Residence", "Model Town Jalandhar", 1000.0});
        model.addRow(new Object[]{"Marrison Hotel", "Rama Mandi Jalandhar", 1500.0});
        model.addRow(new Object[]{"Hotel Maya", "Phagwara , Jalandhar", 2000.0});

        // Add table to frame
        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Hotels();
            }
        });
    }
}
