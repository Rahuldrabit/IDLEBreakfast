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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AllFood extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllFood frame = new AllFood();
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
	public AllFood() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 627, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IDLE CENTER");
		lblNewLabel.setBounds(227, 25, 126, 15);
		lblNewLabel.setFont(new Font("Shonar Bangla", Font.BOLD | Font.ITALIC, 18));
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 99, 627, 332);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 627, 37);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu_3 = new JMenu("User Information");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserInfo user=new UserInfo();
				user.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu = new JMenu("Resturant");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("All");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Food");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("All");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Account Information");
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AccountInfo acc=new AccountInfo();
				acc.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_4 = new JMenu("Package Details");
		mnNewMenu_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PackageInfo pac=new PackageInfo();
				pac.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("Log out");
		mnNewMenu_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login=new Login();
				login.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Feedbeck");
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Feedbeck Resturant");
		mntmNewMenuItem_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Feedbeck feedbeck=new Feedbeck();
				feedbeck.setVisible(true);
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_7 = new JMenu("Cart");
		mnNewMenu_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cart cart=new Cart();
				cart.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_7);
		
		JMenu mnNewMenu_8 = new JMenu("Home");
		mnNewMenu_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomePage home=new HomePage();
				home.setVisible(true);
			}
		});
		mnNewMenu_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage home=new HomePage();
				home.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_8);
		
		JLabel lblNewLabel_2 = new JLabel("Resturant List");
		lblNewLabel_2.setBounds(270, 48, 89, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(38, 127, 151, 140);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Resturant res = new Resturant();
				res.setVisible(true);
			}
		});
		panel_2.setBackground(new Color(192, 192, 192));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Lalbagh Kitchen");
		lblNewLabel_3.setBounds(46, 115, 78, 14);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(239, 127, 151, 140);
		panel_2_1.setBackground(new Color(192, 192, 192));
		panel_2_1.setLayout(null);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("KFC");
		lblNewLabel_3_1.setBounds(46, 115, 78, 14);
		panel_2_1.add(lblNewLabel_3_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(436, 127, 151, 140);
		panel_2_1_1.setBackground(new Color(192, 192, 192));
		panel_2_1_1.setLayout(null);
		panel_1.add(panel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("BFC");
		lblNewLabel_3_1_1.setBounds(46, 115, 78, 14);
		panel_2_1_1.add(lblNewLabel_3_1_1);
		
		
		
	}
}
