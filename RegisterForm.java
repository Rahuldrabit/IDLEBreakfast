package ass1;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfname;
	private JTextField txtmname;
	private JTextField txtlname;
	private JTextField txtusername;
	private JTextField txtmno;
	private JPasswordField passwordpswd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IDLE CENTER");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 18));
		lblNewLabel.setBounds(169, 29, 147, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(68, 240, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(68, 265, 49, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile No.");
		lblNewLabel_1_1_1.setBounds(68, 290, 71, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("First Name");
		lblNewLabel_1_2.setBounds(46, 137, 71, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Middle Name");
		lblNewLabel_1_2_1.setBounds(210, 137, 71, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Last Name");
		lblNewLabel_1_2_1_1.setBounds(380, 137, 71, 14);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		txtfname = new JTextField();
		txtfname.setBounds(21, 162, 96, 20);
		contentPane.add(txtfname);
		txtfname.setColumns(10);
		
		txtmname = new JTextField();
		txtmname.setColumns(10);
		txtmname.setBounds(185, 162, 96, 20);
		contentPane.add(txtmname);
		
		txtlname = new JTextField();
		txtlname.setColumns(10);
		txtlname.setBounds(355, 162, 96, 20);
		contentPane.add(txtlname);
		
		txtusername = new JTextField();
		txtusername.setColumns(10);
		txtusername.setBounds(185, 237, 96, 20);
		contentPane.add(txtusername);
		
		txtmno = new JTextField();
		txtmno.setColumns(10);
		txtmno.setBounds(185, 287, 96, 20);
		contentPane.add(txtmno);
		
		passwordpswd = new JPasswordField();
		passwordpswd.setBounds(185, 262, 96, 20);
		contentPane.add(passwordpswd);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            Class.forName("com.mysql.jdbc.Driver");
		            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idlecenter", "root", "my1234sl");
		                 Statement stmt = con.createStatement()) {

		                String sql = "INSERT INTO userinfo (username, fname, mname, lname, passwords, mobileno) VALUES "
		                        + "('" + txtusername.getText() + "','" + txtfname.getText() + "','" + txtmname.getText() + "','"
		                        + txtlname.getText() + "','" + new String(passwordpswd.getPassword()) + "','" + txtmno.getText() + "')";

		                int rowsAffected = stmt.executeUpdate(sql);

		                if (rowsAffected > 0) {
		                    JOptionPane.showMessageDialog(null, "Data inserted successfully");
		                    Login lg=new Login();
		                    lg.setVisible(true);
		                } else {
		                    JOptionPane.showMessageDialog(null, "Failed to insert data");
		                }
		            }
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		btnSubmit.setBounds(169, 336, 89, 23);
		contentPane.add(btnSubmit);

		
		JLabel lblNewLabel_1_3 = new JLabel("I Have an Account");
		lblNewLabel_1_3.setBounds(46, 393, 168, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg=new Login();
                lg.setVisible(true);
			}
		});
		btnLogin.setBounds(205, 389, 89, 23);
		contentPane.add(btnLogin);
	}
}
