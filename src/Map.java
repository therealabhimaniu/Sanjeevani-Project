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

        model = new DefaultTableModel();
        table = new JTable(model);

        model.addColumn("Location");
        model.addColumn("Distance");

                model.addRow(new Object[]{"Jalandhar Cantt Railway Station", "1.5 KM"});
        model.addRow(new Object[]{"Rama Mandi ", "4 KM"});
        model.addRow(new Object[]{"Model Town", "6 KM"});

                setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);
        setLocationRelativeTo(null);
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
