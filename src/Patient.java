import java.awt.Color;

import javax.swing.*;

public class Patient extends JFrame {

    private JButton btnServices;
    private JButton btnFAQs;
    private JButton btnMaps;
    private JButton btnContactUs;
    private JButton btnHotels;
    private JLabel jLabel10;
    private JLabel jLabel1;

    public Patient() {
        super("Welcome to Sanjeevani");
        initComponents();
        jLabel10.setText("Welcome " + "User");
    }

    private void initComponents() {
        btnServices = new JButton("Services");
        btnServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicesActionPerformed(evt);
            }
        });

        btnFAQs = new JButton("FAQs");
        btnFAQs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAQsActionPerformed(evt);
            }
        });

        btnMaps = new JButton("Maps");
        btnMaps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapsActionPerformed(evt);
            }
        });

        btnContactUs = new JButton("Contact Us");
        btnContactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactUsActionPerformed(evt);
            }
        });

        btnHotels = new JButton("Hotels");
        btnHotels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHotelsActionPerformed(evt);
            }
        });

        jLabel10 = new JLabel("Welcome User");

        jLabel1 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.CYAN);
        getContentPane().setLayout(new java.awt.FlowLayout());

        getContentPane().add(btnServices);
        getContentPane().add(btnFAQs);
        getContentPane().add(btnMaps);
        getContentPane().add(btnContactUs);
        getContentPane().add(btnHotels);
        getContentPane().add(jLabel10);

        getContentPane().add(jLabel1);
        pack();
        setSize(600, 400);
        setLocationRelativeTo(null);

    }

    private void btnServicesActionPerformed(java.awt.event.ActionEvent evt) {
        Services obj = new Services();
        obj.setVisible(true);
        this.dispose();
    }

    private void btnFAQsActionPerformed(java.awt.event.ActionEvent evt) {
        FAQs obj = new FAQs();
        obj.setVisible(true);
        this.dispose();
    }

    private void btnMapsActionPerformed(java.awt.event.ActionEvent evt) {
        Map obj = new Map();
        obj.setVisible(true);
        this.dispose();
    }

    private void btnContactUsActionPerformed(java.awt.event.ActionEvent evt) {
        ContactUs obj = new ContactUs();
        obj.setVisible(true);
        this.dispose();
    }

    private void btnHotelsActionPerformed(java.awt.event.ActionEvent evt) {
        Hotels obj = new Hotels();
        obj.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }
}
