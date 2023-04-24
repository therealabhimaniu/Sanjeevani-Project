import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContactUs extends JFrame {

    private JPanel jPanel1;

    public ContactUs() {
        initComponents();
        addContactInformation();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact Us");
        jPanel1.setLayout(new GridLayout(0, 1));
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        setSize(400, 300);

        setLocationRelativeTo(null);
    }

    private void addContactInformation() {

        JLabel nameLabel = new JLabel("Name: Abhimaniu Sharma");
        JLabel emailLabel = new JLabel("Email: abhimaniu@example.com");
        JLabel phoneLabel = new JLabel("Phone: (123) 456-7890");

        Font contactInfoFont = new Font("Arial", Font.PLAIN, 18);
        Color contactInfoColor = new Color(0, 102, 102);
        nameLabel.setFont(contactInfoFont);
        nameLabel.setForeground(contactInfoColor);
        emailLabel.setFont(contactInfoFont);
        emailLabel.setForeground(contactInfoColor);
        phoneLabel.setFont(contactInfoFont);
        phoneLabel.setForeground(contactInfoColor);

        JPanel contactInfoPanel = new JPanel();
        contactInfoPanel.setLayout(new GridLayout(3, 1));
        contactInfoPanel.setBackground(Color.white);
        contactInfoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        contactInfoPanel.add(nameLabel);
        contactInfoPanel.add(emailLabel);
        contactInfoPanel.add(phoneLabel);

        jPanel1.add(contactInfoPanel);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactUs().setVisible(true);
            }
        });
    }
}
