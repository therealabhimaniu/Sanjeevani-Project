import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Map extends JFrame {
    private JTable table;
    private DefaultTableModel model;

    public Map() {
        super("Nearest Locations and Landmarks");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create table with default table model
        model = new DefaultTableModel();
        table = new JTable(model);

        // Add columns to the table
        model.addColumn("Location");
        model.addColumn("Distance");

        // Add predefined entries to the table
        model.addRow(new Object[]{"Jalandhar Cantt Railway Station", "1.5 KM"});
        model.addRow(new Object[]{"Rama Mandi ", "4 KM"});
        model.addRow(new Object[]{"Model Town", "6 KM"});

        // Add table to frame
        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Map();
            }
        });
    }
}
