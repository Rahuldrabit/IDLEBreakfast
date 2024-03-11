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

public class Food extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food frame = new Food();
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
	public Food() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 867);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 608, 101);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 99, 608, 496);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 608, 37);
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
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AllFood allfood=new AllFood();
				allfood.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Food");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("All");
		mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AllFood allfood=new AllFood();
				allfood.setVisible(true);
			}
		});
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AllFood allfood=new AllFood();
				allfood.setVisible(true);
			}
		});
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
		mnNewMenu_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart cart=new Cart();
				cart.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_7);
		
		JLabel lblNewLabel_2 = new JLabel("Rice");
		lblNewLabel_2.setBounds(270, 48, 89, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(129, 123, 112));
		panel_2.setBounds(10, 88, 588, 136);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Picture 1");
		lblNewLabel_3.setBounds(69, 111, 49, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Picture 2");
		lblNewLabel_3_1.setBounds(239, 111, 49, 14);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Picture 3");
		lblNewLabel_3_1_1.setBounds(447, 111, 49, 14);
		panel_2.add(lblNewLabel_3_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 0, 168));
		panel_3.setBounds(10, 235, 588, 237);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Food price");
		lblNewLabel_4.setBounds(227, 11, 81, 14);
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(38, 66, 125, 146);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Lalbagh Kitechen");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Resturant res = new Resturant();
				res.setVisible(true);
			}
		});
		lblNewLabel_5.setBounds(31, 105, 84, 14);
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_11 = new JLabel("Price :");
		lblNewLabel_11.setBounds(10, 121, 49, 14);
		panel_4.add(lblNewLabel_11);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(91, 7, 24, 23);
		panel_4.add(chckbxNewCheckBox);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(230, 66, 125, 146);
		panel_3.add(panel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("KFC");
		lblNewLabel_5_1.setBounds(52, 104, 49, 14);
		panel_4_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Price :");
		lblNewLabel_11_1.setBounds(10, 121, 49, 14);
		panel_4_1.add(lblNewLabel_11_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(95, 7, 24, 23);
		panel_4_1.add(chckbxNewCheckBox_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(430, 66, 125, 146);
		panel_3.add(panel_4_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("BFC");
		lblNewLabel_5_1_1.setBounds(47, 104, 49, 14);
		panel_4_1_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Price :");
		lblNewLabel_11_1_1.setBounds(10, 121, 49, 14);
		panel_4_1_1.add(lblNewLabel_11_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_1.setBounds(95, 7, 24, 23);
		panel_4_1_1.add(chckbxNewCheckBox_1_1);
		
		JLabel lblNewLabel_10 = new JLabel("Ordered by top order food from this resturant");
		lblNewLabel_10.setBounds(157, 27, 249, 14);
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_6 = new JLabel("About Food");
		lblNewLabel_6.setBounds(232, 606, 98, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Description of the item:");
		lblNewLabel_7.setBounds(10, 633, 117, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("100 gram . Most people use for Dinnar and Lunch.");
		lblNewLabel_8.setBounds(170, 633, 413, 25);
		contentPane.add(lblNewLabel_8);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 682, 610, 137);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Amount");
		lblNewLabel_9.setBounds(113, 11, 49, 14);
		panel_5.add(lblNewLabel_9);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 8, 96, 20);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Total Price");
		lblNewLabel_12.setBounds(113, 42, 75, 14);
		panel_5.add(lblNewLabel_12);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(143, 89, 24, 23);
		panel_5.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_13 = new JLabel("Add to cart");
		lblNewLabel_13.setBounds(213, 93, 90, 14);
		panel_5.add(lblNewLabel_13);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_2_1.setBounds(143, 63, 24, 23);
		panel_5.add(chckbxNewCheckBox_2_1);
		
		JLabel lblNewLabel_14 = new JLabel("I want this regularly for a ");
		lblNewLabel_14.setBounds(207, 67, 135, 14);
		panel_5.add(lblNewLabel_14);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Week");
		rdbtnNewRadioButton.setBounds(351, 63, 58, 23);
		panel_5.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMounth = new JRadioButton("Mounth");
		rdbtnMounth.setBounds(427, 63, 80, 23);
		panel_5.add(rdbtnMounth);
		
		
		
	}
}
