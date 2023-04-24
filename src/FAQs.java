import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FAQs extends JFrame {

    public FAQs() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("FAQs");
        setResizable(true);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Frequently Asked Questions");
        titleLabel.setBounds(70, 20, 300, 30);
        panel.add(titleLabel);

        JTextArea faqsTextArea = new JTextArea();
        faqsTextArea.setEditable(false);
        faqsTextArea.setLineWrap(true);
        faqsTextArea.setWrapStyleWord(true);
        faqsTextArea.setText("Q: What is the timing of the Hospital?\nA: The Timing is 7:00 AM - 10:00 PM  Opened For all kinds of Emergency.\n\nQ: How do I contact the Doctor?\nA: You can contact our doctor by sending an email to abhimaniu@example.com or calling our toll-free number 1-800-123-4567.\n\nQ: How do I Check medicines stocks?\nA: To Check medicines click on Pharmacist.\n\nQ: Can I change my username?\nA: No, currently, you cannot change your username in this application.");
        JScrollPane scrollPane = new JScrollPane(faqsTextArea);
        scrollPane.setBounds(70, 60, 500, 300);
        panel.add(scrollPane);
        add(panel);
        setSize(700, 400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new FAQs().setVisible(true);
        });
    }
}
