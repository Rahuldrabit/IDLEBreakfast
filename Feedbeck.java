package ass1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Feedbeck extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedbeck frame = new Feedbeck();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Feedbeck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 521);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 654, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IDLE CENTER");
		lblNewLabel.setFont(new Font("Shonar Bangla", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(227, 25, 126, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(39, 11, 82, 15);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(409, 25, 178, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(460, 56, 89, 23);
		panel.add(btnNewButton);
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String user = textField.getText().trim();
                        if (user.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter a search term.");
                            return;
                        }
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idlecenter", "root", "my1234sl");
                                 PreparedStatement stmt = con.prepareStatement("SELECT * FROM feedbeck WHERE username = ?")) {
                                stmt.setString(1, user);
                                try (ResultSet rs = stmt.executeQuery()) {
                                    if (rs.next()) {
                                        JOptionPane.showMessageDialog(null, "Feedback found for " + user);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No feedback found for " + user);
                                    }
                                }
                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                        }
                    }
                });
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 102, 654, 372);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 644, 37);
		panel_1.add(menuBar);
		
                JMenu mnNewMenu_3 = new JMenu("User Information");
                mnNewMenu_3.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                UserInfo user=new UserInfo();
                                user.setVisible(true);
                                dispose();
                        }
                });
                menuBar.add(mnNewMenu_3);
		
                JMenu mnNewMenu = new JMenu("Resturant");
                menuBar.add(mnNewMenu);

               JMenuItem mntmNewMenuItem_1 = new JMenuItem("All");
               mntmNewMenuItem_1.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               AllResturant all = new AllResturant();
                               all.setVisible(true);
                               dispose();
                       }
               });
               mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Food");
		menuBar.add(mnNewMenu_1);
		
               JMenuItem mntmNewMenuItem_3 = new JMenuItem("All");
               mntmNewMenuItem_3.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                               AllFood all = new AllFood();
                               all.setVisible(true);
                               dispose();
                       }
               });
               mnNewMenu_1.add(mntmNewMenuItem_3);
		
                JMenu mnNewMenu_2 = new JMenu("Account Information");
                mnNewMenu_2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                AccountInfo acc=new AccountInfo();
                                acc.setVisible(true);
                                dispose();
                        }
                });
                menuBar.add(mnNewMenu_2);
		
               JMenu mnNewMenu_4 = new JMenu("Package Details");
               mnNewMenu_4.addMouseListener(new MouseAdapter() {
                       @Override
                       public void mouseClicked(MouseEvent e) {
                               PackageInfo pac = new PackageInfo();
                               pac.setVisible(true);
                               dispose();
                       }
               });
               menuBar.add(mnNewMenu_4);
		
                JMenu mnNewMenu_5 = new JMenu("Log out");
                mnNewMenu_5.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                Login login=new Login();
                                login.setVisible(true);
                                dispose();
                        }
                });
                menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Feedbeck");
		menuBar.add(mnNewMenu_6);
		
                JMenuItem mntmNewMenuItem_4 = new JMenuItem("Feedbeck Resturant");
                mntmNewMenuItem_4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Feedbeck feed = new Feedbeck();
                                feed.setVisible(true);
                                dispose();
                        }
                });
                mnNewMenu_6.add(mntmNewMenuItem_4);
		
                JMenu mnNewMenu_7 = new JMenu("Cart");
                mnNewMenu_7.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                Cart cart=new Cart();
                                cart.setVisible(true);
                                dispose();
                        }
                });
                menuBar.add(mnNewMenu_7);
		
                JMenu mnNewMenu_8 = new JMenu("Home");
                mnNewMenu_8.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                HomePage home=new HomePage();
                                home.setVisible(true);
                                dispose();
                        }
                });
                menuBar.add(mnNewMenu_8);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setBounds(270, 48, 89, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Your Email");
		lblNewLabel_3.setBounds(78, 103, 110, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Feedbeck");
		lblNewLabel_4.setBounds(77, 138, 83, 14);
		panel_1.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(237, 100, 96, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
                textField_2 = new JTextField();
                textField_2.setColumns(10);
                textField_2.setBounds(237, 135, 278, 171);
                panel_1.add(textField_2);

                JButton btnSubmit = new JButton("Submit");
                btnSubmit.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String username = textField.getText();
                                String email = textField_1.getText();
                                String feedback = textField_2.getText();

                                if (username.isEmpty() || email.isEmpty() || feedback.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Please fill all fields");
                                        return;
                                }

                                try {
                                        Class.forName("com.mysql.cj.jdbc.Driver");
                                        try (Connection con = DriverManager.getConnection(
                                                        "jdbc:mysql://localhost:3306/idlecenter", "root", "my1234sl");
                                                PreparedStatement stmt = con.prepareStatement(
                                                                "INSERT INTO feedback (username, email, feedback) VALUES (?,?,?)")) {
                                                stmt.setString(1, username);
                                                stmt.setString(2, email);
                                                stmt.setString(3, feedback);

                                                int rowsAffected = stmt.executeUpdate();

                                                if (rowsAffected > 0) {
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Feedback submitted successfully");
                                                        textField.setText("");
                                                        textField_1.setText("");
                                                        textField_2.setText("");
                                                } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Failed to submit feedback");
                                                }
                                        }
                                } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                                }
                        }
                });
                btnSubmit.setBounds(237, 317, 89, 23);
                panel_1.add(btnSubmit);

        }
}
