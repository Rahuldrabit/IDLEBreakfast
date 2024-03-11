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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

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
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 805, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IDLE CENTER");
		lblNewLabel.setFont(new Font("Shonar Bangla", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(354, 37, 126, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(39, 11, 82, 15);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(617, 22, 178, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(668, 53, 89, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 99, 805, 496);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 805, 37);
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
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AllResturant allres=new AllResturant();
				allres.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Food");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("All");
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(206, 77, 197));
		panel_2.setBounds(10, 36, 378, 314);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Resturant");
		lblNewLabel_2.setBounds(153, 11, 49, 14);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Resturant res = new Resturant();
				res.setVisible(true);
			}
		});
		panel_3.setBounds(20, 44, 164, 116);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Lalbagh Kitchen");
		lblNewLabel_3.setBounds(28, 91, 85, 14);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(202, 44, 157, 116);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Chillox");
		lblNewLabel_4.setBounds(52, 91, 49, 14);
		panel_3_1.add(lblNewLabel_4);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBounds(20, 171, 164, 116);
		panel_2.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("KFC");
		lblNewLabel_5.setBounds(56, 91, 49, 14);
		panel_3_2.add(lblNewLabel_5);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBounds(202, 171, 157, 116);
		panel_2.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("BFC");
		lblNewLabel_6.setBounds(61, 91, 49, 14);
		panel_3_1_1.add(lblNewLabel_6);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(218, 22, 22));
		panel_2_1.setBounds(405, 36, 378, 314);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Food");
		lblNewLabel_2_1.setBounds(165, 11, 49, 14);
		panel_2_1.add(lblNewLabel_2_1);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Food food=new Food();
				food.setVisible(true);
			}
		});
		panel_3_2_1.setBounds(10, 173, 164, 116);
		panel_2_1.add(panel_3_2_1);
		panel_3_2_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Rice");
		lblNewLabel_9.setBounds(58, 91, 49, 14);
		panel_3_2_1.add(lblNewLabel_9);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBounds(192, 173, 157, 116);
		panel_2_1.add(panel_3_1_1_1);
		panel_3_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Dhala");
		lblNewLabel_10.setBounds(51, 91, 49, 14);
		panel_3_1_1_1.add(lblNewLabel_10);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBounds(10, 46, 164, 116);
		panel_2_1.add(panel_3_3);
		panel_3_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Meat");
		lblNewLabel_7.setBounds(56, 91, 49, 14);
		panel_3_3.add(lblNewLabel_7);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBounds(192, 46, 157, 116);
		panel_2_1.add(panel_3_1_2);
		panel_3_1_2.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Fish");
		lblNewLabel_8.setBounds(53, 91, 49, 14);
		panel_3_1_2.add(lblNewLabel_8);
		
		
	}
}
