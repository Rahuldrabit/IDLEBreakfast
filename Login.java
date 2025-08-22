package ass1;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.util.Properties;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField pswd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IDLE CENTER");
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 18));
		lblNewLabel.setBounds(133, 62, 120, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(78, 154, 60, 14);
		contentPane.add(lblUserName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(78, 207, 49, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("I don't have an account");
		lblNewLabel_1_2.setBounds(78, 350, 139, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(167, 151, 163, 20);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		pswd = new JPasswordField();
		pswd.setBounds(167, 204, 163, 20);
		contentPane.add(pswd);
		
                JButton btnNewButton = new JButton("Login");
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Properties props = new Properties();
                            try (FileInputStream fis = new FileInputStream("db.properties")) {
                                props.load(fis);
                            }
                            try (Connection con = DriverManager.getConnection(
                                        props.getProperty("db.url"),
                                        props.getProperty("db.username"),
                                        props.getProperty("db.password"));
                                 PreparedStatement stmt = con.prepareStatement(
                                        "SELECT * FROM userinfo WHERE username = ? AND passwords = ?")) {
                                stmt.setString(1, txtUserName.getText());
                                stmt.setString(2, String.valueOf(pswd.getPassword()));
                                try (ResultSet rs = stmt.executeQuery()) {
                                    if (rs.next()) {
                                        JOptionPane.showMessageDialog(null, "Login Successfully");
                                        HomePage home = new HomePage();
                                        home.setVisible(true);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Invalid");
                                    }
                                }
                            }
                        } catch (Exception ex) {
                            System.out.print(ex);
                        }
                    }
                });
		btnNewButton.setBounds(149, 271, 89, 23);
		contentPane.add(btnNewButton);

		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterForm reg=new RegisterForm();
				reg.setVisible(true);
			}
		});
		btnRegister.setBounds(227, 346, 89, 23);
		contentPane.add(btnRegister);
	}
}
